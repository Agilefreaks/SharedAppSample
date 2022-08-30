import dependencies.Dependencies

plugins {
    id("commons.shared-library")
    id("com.apollographql.apollo3").version(dependencies.Dependencies.Apollo.VERSION)
}

dependencies {
    apolloMetadata(project(BuildModules.Shared))
}

kotlin {
    cocoapods {
        summary = "Stuff related to user github repositories"
        homepage = "https://github.com/alexandru-calinoiu/SharedAppSample"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "explore_shared"
        }
        sourceSets {
            val commonMain by getting {
                dependencies {
                    implementation(project(BuildModules.Shared))

                    implementation(Dependencies.Apollo.RUNTIME)
                }
            }
        }
    }
}

apollo {
    packageName.set("com.agilefreaks.sharedappsample.features.explore.dtos")
}