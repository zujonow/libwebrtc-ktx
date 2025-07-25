plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.dokka) apply false
//    alias(libs.plugins.dokka.javadoc) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

apply("${rootDir}/publish-root.gradle")
