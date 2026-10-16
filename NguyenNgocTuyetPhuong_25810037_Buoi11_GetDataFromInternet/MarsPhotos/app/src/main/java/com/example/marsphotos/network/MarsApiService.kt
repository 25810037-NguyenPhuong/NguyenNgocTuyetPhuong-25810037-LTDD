package com.example.marsphotos.network

import com.example.marsphotos.model.MarsPhoto
import retrofit2.http.GET

/**
 * Cac API cong khai cua web service Mars. Retrofit tu sinh phan cai dat.
 */
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}
