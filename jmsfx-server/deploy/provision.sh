#!/usr/bin/env bash
#
# One-time setup for a fresh Ubuntu 24.04 Lightsail instance.
# Run as root on the server:  sudo ./provision.sh jmsfx.ctg.co.nz
#
set -euo pipefail

DOMAIN="${1:-jmsfx.ctg.co.nz}"
APP_USER=jmsfx
APP_DIR=/opt/jmsfx

if [[ $EUID -ne 0 ]]; then
    echo "run this as root (sudo ./provision.sh <domain>)" >&2
    exit 1
fi

echo "==> provisioning for ${DOMAIN}"

apt-get update
apt-get install -y wget curl gpg apt-transport-https debian-keyring debian-archive-keyring

# Java 25 is newer than Ubuntu 24.04's repos carry (they stop at 21), so pull
# Temurin from Adoptium. Swap -jre for -jdk if the JRE package is unavailable.
echo "==> installing Temurin 25"
wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public \
    | gpg --dearmor > /etc/apt/trusted.gpg.d/adoptium.gpg
echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" \
    > /etc/apt/sources.list.d/adoptium.list
apt-get update
apt-get install -y temurin-25-jre

echo "==> installing Caddy"
curl -1sLf 'https://dl.cloudsmith.io/public/caddy/stable/gpg.key' \
    | gpg --dearmor > /usr/share/keyrings/caddy-stable-archive-keyring.gpg
curl -1sLf 'https://dl.cloudsmith.io/public/caddy/stable/debian.deb.txt' \
    > /etc/apt/sources.list.d/caddy-stable.list
apt-get update
apt-get install -y caddy

# Lightsail instances ship without swap. The JVM plus Xvfb leaves little headroom
# on the 1GB plan, and without swap the kernel OOM-kills rather than degrading.
if ! swapon --show | grep -q /swapfile; then
    echo "==> adding 2G swapfile"
    fallocate -l 2G /swapfile
    chmod 600 /swapfile
    mkswap /swapfile >/dev/null
    swapon /swapfile
    grep -q '^/swapfile' /etc/fstab || echo '/swapfile none swap sw 0 0' >> /etc/fstab
fi

echo "==> installing JavaFX runtime dependencies"
# Icon composition builds a JavaFX scene graph even for SVG output, so the server
# needs GTK and a virtual display. See https://github.com/ctgnz/jmsfx/issues/32
apt-get install -y xvfb libgtk-3-0t64 libgl1 libxtst6

echo "==> creating ${APP_USER} service account"
id -u "${APP_USER}" >/dev/null 2>&1 || useradd --system --no-create-home --shell /usr/sbin/nologin "${APP_USER}"
install -d -o "${APP_USER}" -g "${APP_USER}" -m 0755 "${APP_DIR}"

echo "==> installing systemd unit"
install -m 0644 "$(dirname "$0")/jmsfx-server.service" /etc/systemd/system/jmsfx-server.service
systemctl daemon-reload
systemctl enable jmsfx-server

echo "==> installing Caddyfile"
sed "s/__DOMAIN__/${DOMAIN}/g" "$(dirname "$0")/Caddyfile" > /etc/caddy/Caddyfile
systemctl reload caddy || systemctl restart caddy

echo
echo "provisioned. Next:"
echo "  1. point ${DOMAIN} at this instance's static IP (A record)"
echo "  2. run deploy.sh from your workstation to ship the jar"
echo "  3. Caddy issues the TLS certificate automatically on first request"
