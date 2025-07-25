import org.gradle.api.JavaVersion

object Build {
    const val COMPILE_SDK = 35
    const val MIN_SDK = 21
    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
}
