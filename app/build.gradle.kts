plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.seasonin.shoppinglistapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.seasonin.shoppinglistapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Room and Architectural Components
    implementation(libs.androidx.room.runtime)
    implementation (libs.androidx.legacy.support.v4)
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.room.ktx)
    //kapt "androidx.room:room-compiler:2.2.1"

    // Coroutines
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    // New Material Design
    implementation (libs.material.v100)

    // ViewModel
    implementation (libs.androidx.lifecycle.extensions.v200)
    implementation (libs.androidx.lifecycle.viewmodel.ktx.v200)
    kapt ("androidx.lifecycle:lifecycle-compiler:$2.0.0")

    // Kodein
    implementation (libs.kodein.di.generic.jvm)
    implementation (libs.kodein.di.framework.android.x)
}