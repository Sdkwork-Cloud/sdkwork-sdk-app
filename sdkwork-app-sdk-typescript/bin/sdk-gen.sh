#!/bin/bash
echo "SDKWork App SDK"
case "$1" in
  build)
    cd "$(dirname "$0")/.." && npm install && npm run build
    ;;
  *)
    echo "Usage: $0 build"
    ;;
esac
