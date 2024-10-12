// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
//}

buildscript {

    repositories {
        google() // Ensure all modules can resolve dependencies from Google Maven repository
        mavenCentral() // Ensure all modules can resolve dependencies from Maven Central
        gradlePluginPortal()
    }
    dependencies {
        classpath(libs.gradle.v802)
        classpath(libs.kotlin)
        classpath(libs.hilt.android.gradle.plugin.v248) // Ensure this line is added
        classpath(libs.hilt.android.gradle.plugin.vlatestversion)
    }
//    dependencies {
//        // Classpath for Android build tools
//        classpath(libs.build.gradle)
//
//        // Classpath for Kotlin Gradle plugin
//        classpath(libs.kotlin.gradle.plugin)
//
//        // Classpath for Hilt Dependency Injection
//        classpath(libs.hilt.android.gradle.plugin)
//    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
