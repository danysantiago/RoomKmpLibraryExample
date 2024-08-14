rootProject.name = "KotlinProject"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven("https://androidx.dev/kmp/builds/12227334/artifacts/snapshots/repository")
        maven("https://androidx.dev/snapshots/builds/12227334/artifacts/repository")
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        maven("https://androidx.dev/kmp/builds/12227334/artifacts/snapshots/repository")
        maven("https://androidx.dev/snapshots/builds/12227334/artifacts/repository")
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":data")
