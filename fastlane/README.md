fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew install fastlane`

# Available Actions
## Android
### android test
```
fastlane android test
```
Runs all the tests
### android test_modole_one
```
fastlane android test_modole_one
```
Runs all the tests module one
### android test_modole_two
```
fastlane android test_modole_two
```
Runs all the tests module two
### android test_modole_three
```
fastlane android test_modole_three
```
Runs all the tests module three
### android coverage_test
```
fastlane android coverage_test
```
Runs jacoco coverage test
### android sonar_report
```
fastlane android sonar_report
```
Executes sonarqube uploads
### android beta
```
fastlane android beta
```
Submit a new Beta Build to Crashlytics Beta
### android deploy
```
fastlane android deploy
```
Deploy a new version to the Google Play

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
