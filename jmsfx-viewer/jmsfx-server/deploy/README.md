# Deploying jmsfx-server

Runbook for the AWS Lightsail instance behind the public icon generator.
The app runs as a systemd service bound to loopback, with Caddy in front
terminating TLS.

## One-time: create the instance

In the Lightsail console:

1. **Create instance** → region **ap-southeast-2 (Sydney)**, the closest to
   New Zealand.
2. Platform **Linux/Unix**, blueprint **Ubuntu 24.04 LTS** (OS only, not an
   app blueprint).
3. Plan: **1 GB RAM / 2 vCPU**. The 512 MB plan is too tight — the fat jar is
   ~89 MB and the JVM plus Caddy will not sit comfortably underneath it.
4. Once running, **Networking → attach a static IP**. Without this the public
   IP changes when the instance is stopped, breaking DNS.
5. **Networking → IPv4 Firewall**: allow **HTTP (80)** and **HTTPS (443)**.
   SSH (22) is open by default.

## One-time: DNS

At 1stdomains, add an **A record** for the subdomain pointing at the static
IP:

```
jmsfx.ctg.co.nz.    A    <static-ip>
```

Leave the MX records alone — mail stays with 1stdomains regardless of where
this app is hosted.

Wait for it to resolve before provisioning, since Caddy requests the
certificate against the live name:

```sh
dig +short jmsfx.ctg.co.nz
```

## One-time: provision the server

Copy this directory up and run it as root:

```sh
scp -r deploy ubuntu@<static-ip>:/tmp/
ssh ubuntu@<static-ip> "sudo bash /tmp/deploy/provision.sh jmsfx.ctg.co.nz"
```

That installs Temurin 25 (Ubuntu's own repos stop at Java 21), installs
Caddy, creates the `jmsfx` service account and `/opt/jmsfx`, and enables the
systemd unit. The service will not start successfully until a jar is
deployed.

## Deploying

From your workstation:

```sh
./deploy.sh standard ubuntu@<static-ip>
# or: JMSFX_LIBRARY=standard JMSFX_HOST=ubuntu@<static-ip> ./deploy.sh
```

It builds with `-am` so the `brand` submodule and upstream modules are
current, uploads to a temp path, then swaps and restarts — a failed transfer
can't leave a truncated jar in place.

## Operating it

```sh
systemctl status jmsfx-server
journalctl -u jmsfx-server -f          # application log
journalctl -u caddy -f                 # TLS issuance and proxy errors
sudo systemctl restart jmsfx-server
```

The JVM is capped at 60% of instance RAM (`-XX:MaxRAMPercentage=60`). If it
gets OOM-killed under load — visible as an abrupt restart in the journal with
no stack trace — move up a plan rather than raising the percentage, since
Caddy and the OS need the remainder.

## One instance per library

The library is the first argument and is never inferred, because there is one instance per library -
each on its own `*.ctg.co.nz` subdomain - and deploying the wrong one is completely silent: the site
comes up, serves icons, and is simply the wrong symbology. See jmsfx#112.

`deploy.sh` builds with that library's profile and ships the jar carrying its classifier
(`jmsfx-server-<version>-<library>.jar`). The unclassified jar beside it in `target/` is the thin one
Spring Boot repackaged from and will not run, which is why the script names the classifier exactly
rather than picking the newest jar.

Each host holds one instance, so the paths on the box do not change per library - `/opt/jmsfx/` and
the `jmsfx-server` unit are the same everywhere. What distinguishes them is which host you deploy to.

To confirm you got the one you meant, ask the running instance:

```sh
curl https://<subdomain>.ctg.co.nz/info/library
# {"name":"Hallux","symbolSets":23}
```

That endpoint exists for exactly this - see jmsfx#111.
