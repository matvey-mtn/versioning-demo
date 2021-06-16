# versioning-demo [OLD VERSION] 

## [Updated version](https://github.com/matvey-mtn/versioning-demo/tree/base2-v1-single-build) 

### Before Composite Builds

The `master` branch is a simple project with 2 services `service-foo` and `service-bar`.

Both services depend on `infrastructure` modules which are not part of this build.
The `infrastructure` directory is not included in root project build.
To compile project at this point you need to run ` ./gradlew --include-build ./infrastructure build`

An alternative option would be to run `cd ./infrastructure && ./gradlew publishToMavenLocal` before build `service-foo` and `service-bar` 

### Demo

1. [Include Infrastructure Build V2](https://github.com/matvey-mtn/versioning-demo/compare/3eca69fa17fc5aa3e6a4953d43ccec4b3781d941...v2-include-build)

1. [Disable Default Substitution V3](https://github.com/matvey-mtn/versioning-demo/compare/v2-include-build...v3-disable-substitution)

1. [Change tests & Find the bug V4](https://github.com/matvey-mtn/versioning-demo/compare/v3-disable-substitution...v4-change-tests)
   
1. [Fix string-utils library V5](https://github.com/matvey-mtn/versioning-demo/compare/v4-change-tests..v5-fix-string-utils)

1. [Bump string-utils version V6](https://github.com/matvey-mtn/versioning-demo/compare/v5-fix-string-utils..v6-replace-string-utils-version)

1. [Configure Dynamic Substitution V7](https://github.com/matvey-mtn/versioning-demo/compare/v6-replace-string-utils-version..v7-dynamic-substitution)

1. [Create new rest library version V8](https://github.com/matvey-mtn/versioning-demo/compare/v7-dynamic-substitution..v8-release-new-rest-library-version)

1. [Release new rest library version & bump everywhere V9](https://github.com/matvey-mtn/versioning-demo/compare/v8-release-new-rest-library-version..v9-replace-rest-lib-version)
