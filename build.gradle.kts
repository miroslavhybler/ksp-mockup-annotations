@file:Suppress("UnstableApiUsage")

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("maven-publish")
}

group = "com.github.miroslavhybler.mockup-annotations"
version = "2.0.0-alpha01"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
    withJavadocJar()

}

kotlin {
    jvmToolchain(jdkVersion = 11)
}

dependencies {
    implementation(libs.annotation)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components.getByName("kotlin"))
                groupId = "com.github.miroslavhybler"
                artifactId = "mockup-annotations"
                version = "2.0.0-alpha01"
                pom {
                    description.set("Jitpack.io deploy")
                }
            }

        }
        repositories {
            mavenLocal()
        }
    }
}