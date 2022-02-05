plugins {
    id("com.android.library")
    kotlin("android")
    id("app.cash.paparazzi")
}

android {
    compileSdkVersion(Configurations.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Configurations.minSdkVersion)
        targetSdkVersion(Configurations.targetSdkVersion)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":theme:base"))

    implementation(project(":theme:brand:red"))
    implementation(project(":theme:brand:blue"))
    implementation(project(":theme:brand:green"))
    implementation(project(":theme:brand:yellow"))

    implementation(Libs.Google.material)
    implementation(Libs.AndroidX.constraintLayout)

    testImplementation(Libs.JUnit.junit)
    testImplementation(Libs.Google.testParameterInjector)
}