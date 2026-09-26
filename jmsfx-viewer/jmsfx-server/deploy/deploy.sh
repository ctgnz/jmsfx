#!/usr/bin/env bash
#
# Build and ship jmsfx-server to the Lightsail instance.
# Run from your workstation:  ./deploy.sh [user@host]
#
set -euo pipefail

TARGET="${1:-${JMSFX_HOST:-}}"
if [[ -z "${TARGET}" ]]; then
    echo "usage: ./deploy.sh user@host   (or set JMSFX_HOST)" >&2
    exit 1
fi

# Lightsail hands out its own key pair, so allow pointing at one rather than
# requiring an ~/.ssh/config entry.
SSH_OPTS=()
if [[ -n "${JMSFX_SSH_KEY:-}" ]]; then
    SSH_OPTS=(-i "${JMSFX_SSH_KEY}")
fi

REPO_ROOT="$(cd "$(dirname "$0")/../../.." && pwd)"
JAR_NAME=jmsfx-server.jar

# Maven skips a missing <resource> directory with only a warning, so a clone
# without the submodule builds green and silently ships without brand.css.
if [[ ! -f "${REPO_ROOT}/brand/css/brand.css" ]]; then
    echo "brand submodule is missing - run: git submodule update --init" >&2
    exit 1
fi

echo "==> building"
cd "${REPO_ROOT}"
# verify, not package: spring-boot:repackage is bound to post-integration-test,
# so package alone leaves a thin jar that will not run.
mvn -B -pl :jmsfx-server -am verify

JAR=$(ls -t "${REPO_ROOT}"/jmsfx-viewer/jmsfx-server/target/jmsfx-server-*.jar | grep -v '\.original$' | head -1)
echo "==> shipping $(basename "${JAR}") ($(du -h "${JAR}" | cut -f1))"

# Upload beside the live jar, then swap and restart, so a failed transfer
# never leaves a truncated jar in place.
scp "${SSH_OPTS[@]}" "${JAR}" "${TARGET}:/tmp/${JAR_NAME}.new"
ssh "${SSH_OPTS[@]}" "${TARGET}" "sudo install -o jmsfx -g jmsfx -m 0644 /tmp/${JAR_NAME}.new /opt/jmsfx/${JAR_NAME} \
    && rm -f /tmp/${JAR_NAME}.new \
    && sudo systemctl restart jmsfx-server"

echo "==> waiting for the service to come back"
ssh "${SSH_OPTS[@]}" "${TARGET}" "sleep 5; systemctl is-active jmsfx-server"

echo "done."
