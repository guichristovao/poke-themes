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

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}