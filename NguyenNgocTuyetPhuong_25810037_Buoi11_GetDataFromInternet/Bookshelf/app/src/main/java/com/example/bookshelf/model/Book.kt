package com.example.bookshelf.model

import kotlinx.serialization.Serializable

/**
 * Ket qua tim kiem cua Google Books API. Chi khai bao cac truong can dung,
 * cac truong con lai bi bo qua nho ignoreUnknownKeys
 */
@Serializable
data class BookSearchResponse(
    val items: List<BookItem> = emptyList()
)

@Serializable
data class BookItem(
    val id: String,
    val volumeInfo: VolumeInfo
)

@Serializable
data class VolumeInfo(
    val title: String = "",
    val authors: List<String> = emptyList(),
    // co sach khong co anh bia nen de null
    val imageLinks: ImageLinks? = null
)

@Serializable
data class ImageLinks(
    val thumbnail: String = ""
)

/**
 * Du lieu gon de giao dien hien thi
 */
data class Book(
    val id: String,
    val title: String,
    val imageUrl: String
)
