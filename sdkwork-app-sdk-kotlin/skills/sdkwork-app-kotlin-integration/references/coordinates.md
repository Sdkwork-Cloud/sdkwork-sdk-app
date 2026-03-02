# SDK Coordinates

- Domain: app
- Language: kotlin
- SDK package directory: `sdkwork-app-sdk-kotlin`
- Build descriptor: `build.gradle.kts`
- SDK coordinate: `com.sdkwork:app-sdk:1.0.0`

## Integration Commands

- Registry mode: `implementation("com.sdkwork:app-sdk:1.0.0")`
- Local mode: `implementation(files("<path-to-sdkwork-app-sdk-kotlin/build/libs/*.jar"))`

## Validation Commands

- Stage 1: `gradle build -x test`
- Stage 5: `gradle test`

