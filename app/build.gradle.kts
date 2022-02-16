plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(Configurations.compileSdkVersion)

    defaultConfig {
        applicationId = Configurations.applicationId
        minSdkVersion(Configurations.minSdkVersion)
        targetSdkVersion(Configurations.targetSdkVersion)
        versionCode = Configurations.versionCode
        versionName = Configurations.versionName

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
    implementation(project(":theme:brand:blue"))
    implementation(project(":theme:brand:green"))
    implementation(project(":theme:brand:red"))
    implementation(project(":theme:brand:yellow"))
    implementation(project(":component:player"))

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.constraintLayout)

    testImplementation(Libs.JUnit.junit)
}