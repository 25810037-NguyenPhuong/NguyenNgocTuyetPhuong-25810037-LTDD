package com.example.bookshelf.data

import com.example.bookshelf.model.Book
import com.example.bookshelf.network.BookshelfApiService

interface BooksRepository {
    suspend fun getBooks(query: String): List<Book>
}

class NetworkBooksRepository(
    private val bookshelfApiService: BookshelfApiService
) : BooksRepository {
    override suspend fun getBooks(query: String): List<Book> {
        return bookshelfApiService.searchBooks(query).items
            // chi lay sach co anh bia
            .filter { it.volumeInfo.imageLinks?.thumbnail?.isNotEmpty() == true }
            .map { item ->
                Book(
                    id = item.id,
                    title = item.volumeInfo.title,
                    // API tra ve link http, Android chan http nen doi sang https
                    imageUrl = item.volumeInfo.imageLinks!!.thumbnail.replace("http://", "https://")
                )
            }
    }
}
