object Dependencies {

    val CORE_KTX by lazy { "androidx.core:core-ktx:${Versions.CORE_KTX_VERSION}" }
    val APPCOMPACT by lazy { "androidx.appcompat:appcompat:${Versions.APPCOMPAT_VERSION}" }
    val MATERIAL by lazy { "com.google.android.material:material:${Versions.MATERIAL_VERSION}" }
    val CONSTRAINT_LAYOUT by lazy { "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT_VERSION}" }
    val JUNIT by lazy { "junit:junit:${Versions.JUNIT_VERSION}" }
    val EXT_JUNIT by lazy { "androidx.test.ext:junit:${Versions.EXT_JUNIT_VERSION}" }
    val ESPRESSO_CORE by lazy { "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE_VERSION}" }

    // Lifecycle
    val VIEWMODEL_KTX by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VERSION}" }
    val LIVEDATE_KTX by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_VERSION}" }
    val VIEWMODEL_SAVED_STATE by lazy { "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE_VERSION}" }
    val LIFECYCLE_COMMON by lazy { "androidx.lifecycle:lifecycle-common-java8:${Versions.LIFECYCLE_VERSION}" }

    // Navigation
    val NAVIGATION_FRAGMENT_KTX by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION_VERSION}" }
    val NAVIGATION_UI by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION_VERSION}" }
    val NAVIGATION_SAFE_ARGS by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION_VERSION}" }

    // Coroutine
    val COROUTINE_CORE by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE_VERSION}" }
    val COROUTINE_ANDROID by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE_VERSION}" }

    // Retrofit
    val RETROFIT by lazy { "com.squareup.retrofit2:retrofit:${Versions.RETROFIT_VERSION}" }
    val RETROFIT_GSON_CONVERTER by lazy { "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_VERSION}" }

    //OkHttp
    val OKHTTP by lazy { "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP_VERSION}" }
    val OKHTTP_INTERCEPTOR by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP_VERSION}" }

    // Hilt
    val HILT by lazy { "com.google.dagger:hilt-android:${Versions.HILT_VERSION}" }
    val HILT_COMPILER by lazy { "com.google.dagger:hilt-compiler:${Versions.HILT_VERSION}" }

    // Glide
    val GLIDE by lazy { "com.github.bumptech.glide:glide:${Versions.GLIDE_VERSION}" }
}