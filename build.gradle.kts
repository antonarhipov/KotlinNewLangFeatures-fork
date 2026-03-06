plugins {
    kotlin("jvm") version "2.3.20-Beta2"
}

group = "com.jetbrains.demo"
version = "2.30-beta"

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}


kotlin {
    jvmToolchain(21)
    compilerOptions {
        languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_3)
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_3)

        freeCompilerArgs.addAll(
            "-Xreturn-value-checker=full",
            "-Xexplicit-backing-fields",
            "-XXLanguage:+NameBasedDestructuring"
        )
    }
}

tasks.test { useJUnitPlatform() }