# Releasing

How a jmsfx release is cut, and what has gone wrong doing it. Written after 2.0.0, which took three tag
cycles and two re-signed tags — every one of them avoidable with the checks below.

Most of this is not jmsfx-specific. Any repository that publishes to the Central Portal from a tag has the
same shape, and the failures generalise.

## The trigger

**A milestone reaching zero open issues.** Close the epic that tracks the work, then start here.

## The sequence

### 1. Release-readiness pass, before touching a version

Nothing in this step changes the tree. It exists because `-Prelease` is only ever exercised at tag
time — see [What keeps going wrong](#what-keeps-going-wrong) — so assume it is stale.

```bash
# Every checker, against every library.
mvn -Pstandard clean verify && mvn -Phistorical clean verify && mvn -Pbattleorder clean verify

# The fragment tools. --check writes nothing.
java -cp "jmsfx-tools/jmsfx-generator/target/classes:$CP" \
  io.github.ctgnz.jmsfx.generator.FragmentNormaliser --check library/*/src/main/model/config.yml
java -cp "..." io.github.ctgnz.jmsfx.generator.FragmentShapeChecker library/*/src/main/model/config.yml

# VerifyIcons, per library, nearest tree first.
java -cp "...:library/jmsfx-<lib>/target/classes:..." io.github.ctgnz.jmsfx.icon.VerifyIcons \
  library/jmsfx-<lib>/src/main/model library/jmsfx-standard/src/main/model
```

Then read, rather than run:

- **`jmsfx-parent/pom.xml`'s `excludeArtifacts`.** Confirm the list is still what you mean. Entries have
  outlived their reason twice.
- **`.github/workflows/release.yml`'s packaging matrix and `artifacts:` list.** Same question.
- **`gh secret list`.** See below.

### 2. Bump the version

```bash
mvn versions:set -DnewVersion=X.Y.Z -DprocessAllModules=true -DgenerateBackupPoms=false
grep -rn SNAPSHOT --include=pom.xml . | grep -v target      # must be empty
```

**`-DprocessAllModules=true` is not optional.** Since [#102](https://github.com/ctggames/jmsfx/issues/102) no
module declares the root aggregator as its parent, so the default parent-chain walk bumps the aggregator
alone and silently leaves the other eleven poms behind. This is what made `versions:set` look unreliable.

### 3. Rehearse the release profile *with javadoc*

```bash
mvn -Pstandard,release clean package -DskipTests -Dgpg.skip=true
```

**Do not add `-Dmaven.javadoc.skip=true`.** Javadoc and GPG are the only two things `-Prelease` adds;
skipping both makes the rehearsal prove nothing. Skipping GPG locally is fine — the key lives in CI.

Javadoc runs with `doclint=all,-missing`, so an unresolvable `{@link}` is a build error. Since javadoc runs
nowhere else, a rename can leave dangling references for months without any build noticing.

### 4. Commit, and let the tag sit on it

One `Release X.Y.Z` commit on master, **directly, not via a PR**, with the release notes as the commit
message. If other commits have crept in since, squash them in first so the tag names a single release
commit — verify the tree hash is unchanged across the squash:

```bash
BEFORE=$(git rev-parse HEAD^{tree})
git reset --soft <commit-before-the-release>
git commit -F <notes>
[ "$BEFORE" = "$(git rev-parse HEAD^{tree})" ] && echo IDENTICAL
git push --force-with-lease origin master
```

### 5. Tag

The signed annotated tag is **CTG's to create and push**:

```bash
git pull
git tag -s X.Y.Z -m "Release X.Y.Z" && git push origin X.Y.Z
```

### 6. Publish and verify

`autoPublish` is false, so the tag *stages* a validated deployment and publishing stays a deliberate click.
Before clicking, confirm the bundle holds exactly:

```
jmsfx-parent  jmsfx-core (+ sources, javadoc, tests)  jmsfx-standard  jmsfx-historical  jmsfx-battleorder
```

and **nothing** named `jmsfx`, `jmsfx-tools` or `jmsfx-viewer` — those are the aggregator and group poms.
`jmsfx-parent` is the easy one to miss and the one whose absence breaks resolution for everyone.

Afterwards, verify against the repository rather than the build log:

```bash
curl -s https://repo1.maven.org/maven2/io/github/ctgnz/ | grep jmsfx
curl -s https://repo1.maven.org/maven2/io/github/ctgnz/jmsfx-core/X.Y.Z/
```

### 7. Deploy, then bump

Deploy per `jmsfx-viewer/jmsfx-server/deploy/README.md`, **from the tag** — master is about to move on.
Then one `Bump to <next>-SNAPSHOT` commit.

## What keeps going wrong

Three of 2.0.0's four failures were the same thing: **`-Prelease` only runs at tag time, so it drifts, and
so does everything that only runs inside it.**

| failure | why nothing caught it |
| --- | --- |
| `gpg: no default secret key` | `release.yml` was copied from foxglove, which has the four secrets; jmsfx never had them created. No tag had run since the workflow was added, so nothing noticed. |
| `jmsfx-battleorder` missing from the packaging matrix; only two of four library jars attached | Both were conditional on work that had landed months earlier. Nothing re-reads a comment. |
| six dangling `{@link}` references to a renamed method | Javadoc runs only under `-Prelease`. |

### A re-run uses the workflow at the tagged commit

You **cannot** fix a workflow on master and re-run a failed tag build — Actions executes the workflow as it
exists at the triggering ref. Push a fresh tag instead. Which means: get the workflow right *before*
tagging, because the only remedy afterwards costs a delete-and-re-sign.

### The four secrets

```
GPG_PRIVATE_KEY     the ASCII-armoured *secret* key: gpg --armor --export-secret-keys <id>
                    Not the public key. Not base64-of-binary. Keep the BEGIN/END lines.
GPG_PASSPHRASE      that key's passphrase
CENTRAL_USERNAME    a Central Portal *user token*, not the Portal login
CENTRAL_PASSWORD
```

Pipe the export straight in so the key never reaches a shell history:

```bash
gpg --armor --export-secret-keys <KEY_ID> | gh secret set GPG_PRIVATE_KEY --repo ctgnz/jmsfx
```

The public half must be discoverable on a keyserver — Central validates it.

### Conditional exclusions

[#148](https://github.com/ctggames/jmsfx/issues/148) proposes a CI javadoc run plus a greppable
`release-gate: <repo>#<issue>` convention, so a comment saying *remove this once X lands* becomes a build
signal rather than something someone has to remember.

## Verifying a deployment

Three things that have wasted time, kept because they keep wasting it:

- **The page paths are `/`, `/generate`, `/browse`, `/download`, `/symbology`.** Guessing gives 404s that
  look like a broken deploy.
- **`/info/library` is the liveness check from 2.0.0 on.** It returns the library name and symbol-set count,
  and it *404s on 1.5.0* — the endpoint is new — so a 200 proves the new version is up. Nothing exposes the
  version itself over HTTP.
- **Path variables resolve on the enum constant name, not the id.** `/LandUnits/symbol/AIR_DEFENSE` rather
  than `/LandUnits/symbol/1101`. `/info/symbols` and `/{set}/entity/list` both return a `name` field — ask
  the API rather than guessing. And `/symbol` is *frame-only* by design, so a ~460-byte response carrying
  only `id="frame"` is correct.
