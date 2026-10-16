package com.example.bookshelf.network

import com.example.bookshelf.model.BookSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BookshelfApiService {
    // vi du: GET volumes?q=jazz+history&maxResults=40
    @GET("volumes")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int = 40
    ): BookSearchResponse
}
