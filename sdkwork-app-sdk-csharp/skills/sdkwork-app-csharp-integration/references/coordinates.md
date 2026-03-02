# SDK Coordinates

- Domain: app
- Language: csharp
- SDK package directory: `sdkwork-app-sdk-csharp`
- Build descriptor: `App.csproj`
- SDK coordinate: `App@1.0.0`

## Integration Commands

- Registry mode: `dotnet add package App --version 1.0.0`
- Local mode: `dotnet add <target.csproj> reference <path-to-sdkwork-app-sdk-csharp/App.csproj>`

## Validation Commands

- Stage 1: `dotnet restore`
- Stage 5: `dotnet test`

