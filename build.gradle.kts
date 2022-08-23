plugins {
    id("com.android.application") apply false
    id("com.android.library") apply false
    kotlin("android") apply false
}

tasks {
    val clean by registering(Delete::class) {
        delete(rootProject.buildDir)
    }
}