// Gradle:  Android 애플리케이션 및 기타 프로젝트의 빌드와 종속성 관리를 위한 강력한 빌드 도구

// 프로젝트에 적용할 플러그인
// 플러그인: Gradle 빌드 도구의 확장 기능으로, 특정 기능이나 작업을 수행할 수 있도록 도와주는 도구나 라이브러리
// 기본 구조: id("plugin-id") version "plugin-version"
plugins {
    // 안드로이드 어플 개발 플러그인
    id("com.android.application")
    // 코틀린을 통한 안드로이드 어플 개발 플러그인
    id("org.jetbrains.kotlin.android")
    // 코틀린 어노테이션 프로세싱 플러그인 (아직 정확히 모르겠음)
    // 어노테이션: @ 뒤에 있는 거
    id("kotlin-kapt")
}

// 안드로이드 애플리케이션의 빌드 및 설정 옵션
android {
    namespace = "com.example.moiroom"
    // 애플리케이션을 빌드할 때 사용되는 SDK 버전
    compileSdk = 34

    // 빌드된 애플리케이션의 패키지 정의
    defaultConfig {
        // 패키지 이름(고유 식별자)
        applicationId = "com.example.moiroom"
        // 어플 실행을 위한 최소 안드로이드 SDK 버전
        minSdk = 30
        // 명시적으로 대상이 되는 안드로이드 SDK 버전
        targetSdk = 34
        // 어플의 빌드 버전, 업데이트를 관리하고 구분할 때 사용
        versionCode = 1
        // 사용자에게 표시되는 버전 이름
        versionName = "1.0"
        // 테스트를 실행할 때 사용할 도구(instrumentation runner) 설정
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    // 빌드 유형을 구성
    buildTypes {
        // release 유형
        release {
            // 코드 축소 및 난독화 비활성화
            isMinifyEnabled = false
            // ProGuard 설정 파일 지정(난독화)
            proguardFiles(
                // ProGuard 규칙 파일 설정
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    // 애플리케이션의 소스 코드를 컴파일할 때 사용되는 옵션 설정
    // 컴파일: 고수준(코틀린)으로 작성된 코드를 저수준(바이트)로 변환하는 작업
    compileOptions {
        // 자바 소스 코드의 호환성 지정
        sourceCompatibility = JavaVersion.VERSION_1_8
        // 컴파일될 바이트 코드의 호환성 지정
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    // 코틀린 컴파일러 옵션 설정
    kotlinOptions {
        // JVM(자바 가상 머신) 버전 설정
        jvmTarget = "1.8"
    }

    // 뷰바인딩 활성화
    viewBinding {
        enable = true
    }
}

// 외부 라이브러리 또는 모듈의 종속성을 정의
dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // retrofit, gson-converter
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // 카카오 로그인 모듈 추가
    implementation("com.kakao.sdk:v2-user:2.0.1")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    // 갤러리 접근용
    implementation("androidx.activity:activity-ktx:1.4.0")
    implementation("androidx.fragment:fragment-ktx:1.3.6")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    kapt("com.github.bumptech.glide:compiler:4.12.0")
    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    // viewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")
    // 삼성헬스
    implementation("androidx.health:health-connect-client:1.0.0-alpha01")
    // 구글(안드로이드) 헬스
    implementation("com.google.android.gms:play-services-fitness:20.0.0")
    implementation("com.google.android.gms:play-services-auth:20.0.0")
    implementation("com.samsung.android.sdk.healthdata:health-data:2.1.0")
    //
    implementation("com.google.android.libraries.healthdata:health-data-api:1.0.0-alpha01")

}