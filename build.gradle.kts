plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.serialization") version "2.1.0"
    application
}

group = "naser09.github.io"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
    testImplementation ("org.jetbrains.kotlin:kotlin-test")
}

kotlin {
    jvmToolchain(21)
}
application{
    mainClass.set("MainKt")
}