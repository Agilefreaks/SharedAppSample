package dependencies

object TestDependencies {
    const val JUNIT = "junit:junit:4.13.2"
    const val KOIN = "io.insert-koin:koin-test:${Dependencies.Koin.VERSION}"
    const val MOCKATIVE = "io.mockative:mockative:1.3.1"

    object Apollo {
        const val MOCK_SERVER = "com.apollographql.apollo3:apollo-mockserver:${Dependencies.Apollo.VERSION}"
    }

    object Kotlinx {
        object Coroutines {
            const val TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
        }
    }

    // only used in tests to read response files
    object Suparnatural {
        private const val VERSION = "1.1.0"

        const val FS = "com.suparnatural.kotlin:fs:$VERSION"
        const val FS_ANDROID = "com.suparnatural.kotlin:fs-android:$VERSION"
        const val FS_IOS_X64 = "com.suparnatural.kotlin:fs-iosx64:$VERSION"
    }
}
