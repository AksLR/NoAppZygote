plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.kdjdjski"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kdjdjski"
        minSdk = 29
        targetSdk = 34
        versionCode = 2
        versionName = "1.0-diagnostic"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources.excludes += "**"
    }

    dependenciesInfo {
        includeInApk = false
        includeInBundle = false
    }
}

dependencies {
    compileOnly(libs.xposed.api)
}
