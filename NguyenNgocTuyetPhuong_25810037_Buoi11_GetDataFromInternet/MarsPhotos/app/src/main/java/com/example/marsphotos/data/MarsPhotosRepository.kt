package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

/**
 * Repository: lop trung gian lay du lieu, ViewModel khong can biet du lieu den tu dau
 */
interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

/**
 * Cai dat lay du lieu tu mang. marsApiService duoc truyen vao tu ben ngoai (dependency injection)
 */
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}
