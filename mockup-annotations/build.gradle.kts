@file:Suppress("UnstableApiUsage")

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "com.github.miroslavhybler.mockup-annotations"
version = "1.1.6"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
    withJavadocJar()

}

kotlin {
    jvmToolchain(jdkVersion = 8)
}

dependencies {
    implementation("androidx.annotation:annotation:1.7.1")
}