package edu.hcmute.todolist.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.hcmute.todolist.data.TodoItem

@Composable
fun TodoScreen(
    modifier: Modifier = Modifier,
    todoViewModel: TodoViewModel = viewModel()
) {
    val todos by todoViewModel.todos.collectAsState()
    var newTitle by rememberSaveable { mutableStateOf("") }
    val doneCount = todos.count { it.isDone }

    Column(modifier = modifier.padding(16.dp)) {
        Text("Việc cần làm", style = MaterialTheme.typography.titleLarge)
        Text("Đã xong $doneCount/${todos.size} việc")
        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            OutlinedTextField(
                value = newTitle,
                onValueChange = { newTitle = it },
                label = { Text("Nhập việc mới") },
                singleLine = true,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Button(onClick = {
                todoViewModel.addTodo(newTitle)
                newTitle = ""
            }) {
                Text("Thêm")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(
            onClick = { todoViewModel.deleteDone() },
            enabled = doneCount > 0
        ) {
            Text("Xoá các việc đã xong")
        }
        Text(
            "Tắt hẳn app rồi mở lại: danh sách vẫn còn vì đã lưu bằng Room.",
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(todos, key = { it.id }) { todo ->
                TodoRow(
                    todo = todo,
                    onCheckedChange = { todoViewModel.toggleDone(todo) },
                    onDelete = { todoViewModel.delete(todo) }
                )
            }
        }
    }
}

@Composable
fun TodoRow(
    todo: TodoItem,
    onCheckedChange: () -> Unit,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = todo.isDone, onCheckedChange = { onCheckedChange() })
            Text(
                text = todo.title,
                // viec da xong thi gach ngang
                textDecoration = if (todo.isDone) TextDecoration.LineThrough else TextDecoration.None,
                modifier = Modifier.weight(1f)
            )
            TextButton(onClick = onDelete) {
                Text("Xoá")
            }
        }
    }
}
