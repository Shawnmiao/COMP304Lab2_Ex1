pluginManagement {
    repositories {
        google() // Google's Maven repository for Android-related plugins
        mavenCentral() // Maven Central repository for other dependencies
        gradlePluginPortal() // Gradle Plugin Portal for resolving Gradle plugins
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Prevents repositories in project-level build files
    repositories {
        google() // Ensure all modules can resolve dependencies from Google Maven repository
        mavenCentral() // Ensure all modules can resolve dependencies from Maven Central
    }
}



rootProject.name = "MingyueMiao_COMP304Lab2_Ex1"
include(":app")
