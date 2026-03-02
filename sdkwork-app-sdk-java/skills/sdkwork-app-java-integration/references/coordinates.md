# SDK Coordinates

- Domain: app
- Language: java
- SDK package directory: `sdkwork-app-sdk-java`
- Build descriptor: `pom.xml`
- SDK coordinate: `com.sdkwork:app-sdk:1.0.0`

## Integration Commands

- Registry mode: `mvn dependency:get -Dartifact=com.sdkwork:app-sdk:1.0.0`
- Local mode: `mvn install:install-file -Dfile=<path-to-jar> -DgroupId=com.sdkwork -DartifactId=app-sdk -Dversion=1.0.0 -Dpackaging=jar`

## Validation Commands

- Stage 1: `mvn -DskipTests compile`
- Stage 5: `mvn test -DskipTests=false`

