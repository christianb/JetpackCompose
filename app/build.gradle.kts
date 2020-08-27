plugins {
	id("com.android.application")
	kotlin("android")
	kotlin("android.extensions")
}

android {
	compileSdkVersion(29)
	buildToolsVersion("30.0.2")

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
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
		kotlinCompilerExtensionVersion = "1.0.0-alpha01"
	}
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
	implementation("androidx.core:core-ktx:1.1.0")
	implementation("androidx.appcompat:appcompat:1.1.0")
	implementation("com.google.android.material:material:1.0.0")
	implementation("androidx.constraintlayout:constraintlayout:1.1.3")
	implementation("androidx.navigation:navigation-fragment-ktx:2.1.0")
	implementation("androidx.navigation:navigation-ui-ktx:2.1.0")
	implementation("androidx.compose.ui:ui:1.0.0-alpha01")
	implementation("androidx.compose.material:material:1.0.0-alpha01")
	implementation("androidx.ui:ui-tooling:1.0.0-alpha01")
	
	testImplementation("junit:junit:4.12")

	androidTestImplementation("androidx.test.ext:junit:1.1.1")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")

}