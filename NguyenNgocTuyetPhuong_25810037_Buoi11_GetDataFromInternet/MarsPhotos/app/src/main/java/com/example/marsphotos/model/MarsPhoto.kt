package com.example.marsphotos.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Mot anh sao Hoa nhan ve tu web service
 */
@Serializable
data class MarsPhoto(
    val id: String,
    // ten truong trong JSON la img_src, doi sang camelCase cho dung quy uoc Kotlin
    @SerialName(value = "img_src")
    val imgSrc: String
)
