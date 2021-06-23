# versioning-demo
Showcasing infrastructure versioning with composite builds

### Versioned Builds

The code in this branch is a simple project with 2 services `service-foo` and `service-bar`.

Both services depend on the artifacts created by `infrastructure` modules.
To compile project you need to run `./gradlew publishToMavenLocal` 
and only then `./gradlew build`

### Demo


1. [Use composite build to test a new version of rest lib - V2](https://github.com/matvey-mtn/versioning-demo/compare/master..base2-v2-update-rest-lib-using-composite-build)

1. [Release rest:1.0.1 and update all services - V3](https://github.com/matvey-mtn/versioning-demo/compare/base2-v2-update-rest-lib-using-composite-build..base2-v3-release-rest-lib-and-replace-everywhere)

1. [Use dynamic config for composite builds - V4](https://github.com/matvey-mtn/versioning-demo/compare/base2-v3-release-rest-lib-and-replace-everywhere..base2-v4-dynamic-composite-build-config)

Link to [Old Version](https://github.com/matvey-mtn/old-version)
