package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

// Retrofit dung kotlinx.serialization de doi JSON thanh doi tuong Kotlin
private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface MarsApiService {
    // goi GET toi BASE_URL/photos
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}

// singleton: ca app chi dung chung mot doi tuong Retrofit service
object MarsApi {
    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
