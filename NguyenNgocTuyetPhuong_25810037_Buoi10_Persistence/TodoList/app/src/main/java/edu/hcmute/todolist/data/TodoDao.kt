package edu.hcmute.todolist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

// DAO: khai bao cac thao tac voi bang todos
@Dao
interface TodoDao {
    // tra ve Flow nen danh sach tu cap nhat moi khi bang thay doi
    @Query("SELECT * FROM todos ORDER BY is_done ASC, id DESC")
    fun getAll(): Flow<List<TodoItem>>

    @Insert
    suspend fun insert(todo: TodoItem)

    @Update
    suspend fun update(todo: TodoItem)

    @Delete
    suspend fun delete(todo: TodoItem)

    @Query("DELETE FROM todos WHERE is_done = 1")
    suspend fun deleteDone()
}
