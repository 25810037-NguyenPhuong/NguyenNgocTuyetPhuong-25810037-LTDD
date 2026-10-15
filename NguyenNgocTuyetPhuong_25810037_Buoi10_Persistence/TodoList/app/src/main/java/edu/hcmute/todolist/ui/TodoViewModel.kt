package edu.hcmute.todolist.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import edu.hcmute.todolist.data.TodoDatabase
import edu.hcmute.todolist.data.TodoItem
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class TodoViewModel(application: Application) : AndroidViewModel(application) {

    private val todoDao = TodoDatabase.getInstance(application).todoDao()

    // Flow cua Room duoc doi thanh StateFlow de giao dien doc
    val todos: StateFlow<List<TodoItem>> = todoDao.getAll()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    fun addTodo(title: String) {
        // khong them viec rong
        if (title.isBlank()) {
            return
        }
        viewModelScope.launch {
            todoDao.insert(TodoItem(title = title.trim()))
        }
    }

    fun toggleDone(todo: TodoItem) {
        viewModelScope.launch {
            todoDao.update(todo.copy(isDone = !todo.isDone))
        }
    }

    fun delete(todo: TodoItem) {
        viewModelScope.launch {
            todoDao.delete(todo)
        }
    }

    fun deleteDone() {
        viewModelScope.launch {
            todoDao.deleteDone()
        }
    }
}
