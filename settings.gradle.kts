pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("jp.co.gahojin.refreshVersions") version "0.1.4"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
            credentials {
                username = gradle.startParameter.projectProperties["authToken"]
            }
        }
    }
}

refreshVersions {
    sortSection = true
}

rootProject.name = "libwebrtc-ktx"
include("core")
