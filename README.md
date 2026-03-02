# SDKWork App SDK

This directory contains all generated SDK artifacts for the `app` API group.

## OpenAPI Source

- Local snapshot: `app-openapi-8080.json`
- Runtime endpoint: `http://localhost:8080/v3/api-docs/app`

Before regeneration, make sure the endpoint returns a valid OpenAPI 3.x document.

## Generated Languages

- `sdkwork-app-sdk-typescript`
- `sdkwork-app-sdk-python`
- `sdkwork-app-sdk-go`
- `sdkwork-app-sdk-java`
- `sdkwork-app-sdk-kotlin`
- `sdkwork-app-sdk-swift`
- `sdkwork-app-sdk-csharp`
- `sdkwork-app-sdk-flutter`

## Regenerate SDKs

Run from repository root:

```bash
node sdk/sdkwork-sdk-generator/bin/sdkgen.js generate \
  -i spring-ai-plus-app-api/sdkwork-sdk-app/app-openapi-8080.json \
  -o spring-ai-plus-app-api/sdkwork-sdk-app/sdkwork-app-sdk-<language> \
  -n sdkwork-app-sdk \
  -t app \
  -l <language> \
  --base-url http://localhost:8080 \
  --api-prefix /app/v3/api
```

`<language>` supports:

- `typescript`
- `python`
- `go`
- `java`
- `kotlin`
- `swift`
- `csharp`
- `flutter`

## Refresh OpenAPI Snapshot

If you want to regenerate from the latest running service schema:

```bash
curl http://localhost:8080/v3/api-docs/app -o spring-ai-plus-app-api/sdkwork-sdk-app/app-openapi-8080.json
```

## Authentication Modes (Mutually Exclusive)

Use exactly one auth mode for the same client instance.

1. API Key mode
- Header: `Authorization: Bearer <apiKey>`

2. Dual-token mode
- Header: `Access-Token: <accessToken>`
- Header: `Authorization: Bearer <authToken>`

Do not configure API key together with dual tokens on the same client instance.

## Client Naming

The generated primary client name is unified across languages:

- `SdkworkAppClient`

Each language package includes its own usage examples in its local `README.md`.

## Language README Entrypoints

- `sdkwork-app-sdk-typescript/README.md`
- `sdkwork-app-sdk-python/README.md`
- `sdkwork-app-sdk-go/README.md`
- `sdkwork-app-sdk-java/README.md`
- `sdkwork-app-sdk-kotlin/README.md`
- `sdkwork-app-sdk-swift/README.md`
- `sdkwork-app-sdk-csharp/README.md`
- `sdkwork-app-sdk-flutter/README.md`

## Troubleshooting

- If input is not a valid OpenAPI 3.x document, generation fails fast by design.
- If the input payload is an upstream error envelope (`code/msg`) instead of schema, generation stops with source validation error.
- Verify your running endpoint first: `http://localhost:8080/v3/api-docs/app`.# sdkwork-sdk-app
