#!/usr/bin/env bash
#
# Build and ship jmsfx-server to the Lightsail instance.
# Run from your workstation:  ./deploy.sh <library> [user@host]
#
# The library is named, never guessed: there is one instance per library, each on its own
# subdomain, and deploying the wrong one is silent. See jmsfx#112.
#
set -euo pipefail

LIBRARY="${1:-${JMSFX_LIBRARY:-}}"
TARGET="${2:-${JMSFX_HOST:-}}"
if [[ -z "${LIBRARY}" || -z "${TARGET}" ]]; then
    echo "usage: ./deploy.sh <library> user@host   (or set JMSFX_LIBRARY and JMSFX_HOST)" >&2
    echo "       library is one of: standard, historical" >&2
    exit 1
fi
case "${LIBRARY}" in
    standard|historical) ;;
    *) echo "unknown library '${LIBRARY}' - expected standard or historical" >&2; exit 1 ;;
esac

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

echo "==> building ${LIBRARY}"
cd "${REPO_ROOT}"
VERSION=$(mvn -q -B help:evaluate -Dexpression=project.version -DforceStdout -pl :jmsfx-server 2>/dev/null | tail -n1)
# verify, not package: spring-boot:repackage is bound to post-integration-test,
# so package alone leaves a thin jar that will not run.
mvn -B -P"${LIBRARY}" -pl :jmsfx-server -am verify

# The fat jar is the one carrying the library classifier; the unclassified jar beside it is the
# thin one Spring Boot repackaged from, and it will not run. Naming the classifier exactly also
# means a stale jar from another library cannot be picked up by accident.
JAR="${REPO_ROOT}/jmsfx-viewer/jmsfx-server/target/jmsfx-server-${VERSION}-${LIBRARY}.jar"
if [[ ! -f "${JAR}" ]]; then
    echo "no ${LIBRARY} jar at ${JAR}" >&2
    exit 1
fi
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
