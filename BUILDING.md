# Building

This repository uses an older Android toolchain and requires a matching build
environment.

## Cursor Cloud / CI setup

Set up this Android project to build with Gradle 4.10.1: install
Temurin/OpenJDK 8, Android SDK platform 28, build-tools 28.0.3, platform-tools,
accept Android SDK licenses, and expose JAVA_HOME plus Android SDK path for
cloud agents.

## Required tools

- Gradle wrapper: `gradlew` with Gradle 4.10.1
- JDK: Temurin/OpenJDK 8
- Android SDK platform: `android-28`
- Android SDK build-tools: `28.0.3`
- Android SDK platform-tools

The legacy Gradle/Kotlin/KAPT stack in this project is not compatible with
JDK 21. Use JDK 8 when running Gradle tasks.

If Android SDK is installed outside the default location, create an ignored
`local.properties` file:

```properties
sdk.dir=/path/to/android-sdk
```

Debug build command:

```bash
JAVA_HOME=/path/to/jdk8 PATH=/path/to/jdk8/bin:$PATH ./gradlew :app:assembleDebug --no-daemon
```
