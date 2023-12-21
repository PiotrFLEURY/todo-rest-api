package com.example.todoapi.services;

import com.example.todoapi.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getTodos();

    Todo createTodo(Todo todo);

    Todo updateTodoById(Long id, Todo todo);

    void deleteTodoById(Long id);
}
