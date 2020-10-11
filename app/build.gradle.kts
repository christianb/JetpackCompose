plugins {
	id("com.android.application")
	kotlin("android")
	kotlin("android.extensions")
}

android {
	compileSdkVersion(29)

	defaultConfig {
		applicationId = "com.jetpackcompose"
		minSdkVersion(21)
		targetSdkVersion(29)
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		named("release") {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}

	kotlinOptions {
		jvmTarget = "1.8"
		useIR = true
	}

	buildFeatures {
		compose = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = "1.0.0-alpha04"
		kotlinCompilerVersion = "1.4.0"
	}
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.10")
	implementation("androidx.core:core-ktx:1.3.2")
	implementation("androidx.appcompat:appcompat:1.2.0")
	implementation("androidx.compose.ui:ui:1.0.0-alpha04")
	implementation("androidx.compose.material:material:1.0.0-alpha04")
	implementation("androidx.ui:ui-tooling:1.0.0-alpha04")
	
	testImplementation("junit:junit:4.13")

	androidTestImplementation("androidx.test.ext:junit:1.1.2")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

}