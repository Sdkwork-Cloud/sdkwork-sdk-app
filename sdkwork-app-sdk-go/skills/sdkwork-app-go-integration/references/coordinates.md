# SDK Coordinates

- Domain: app
- Language: go
- SDK package directory: `sdkwork-app-sdk-go`
- Build descriptor: `go.mod`
- SDK coordinate: `github.com/sdkwork/app-sdk@v1.0.0`

## Integration Commands

- Registry mode: `go get github.com/sdkwork/app-sdk@v1.0.0`
- Local mode: `go mod edit -replace github.com/sdkwork/app-sdk=<path-to-sdkwork-app-sdk-go> && go mod tidy`

## Validation Commands

- Stage 1: `go mod tidy`
- Stage 5: `go test ./...`

