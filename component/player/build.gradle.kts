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

    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")

    testImplementation("junit:junit:4.13.2")
    testImplementation("com.google.testparameterinjector:test-parameter-injector:1.8")
}