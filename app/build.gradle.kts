plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("version-catalog")
    id("maven-publish")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.wim.catalog"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintLayout)
    implementation(libs.bundles.coil)
}

catalog {
    // declare the aliases, bundles and versions in this block
    versionCatalog {
        from(files("../libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.wim"
            artifactId = "catalog"
            version = "0.0.1"
            from(components["versionCatalog"])
        }
    }
}