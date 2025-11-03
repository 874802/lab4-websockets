plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.ktlint)
}

group = "es.unizar.webeng"
version = "2025-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(platform(libs.spring.boot.bom))
    implementation(libs.spring.boot.starter.websocket)
    implementation(libs.kotlin.logging)

    testImplementation(libs.spring.boot.starter.test)
    testImplementation(libs.ninjasquad.springmocck)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
