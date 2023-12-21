package com.example.todoapi.services.impl;

import com.example.todoapi.model.Todo;
import com.example.todoapi.repositories.TodoRepository;
import com.example.todoapi.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo updateTodoById(Long id, Todo todo) {
        // TODO
        return null;
    }

    @Override
    public void deleteTodoById(Long id) {
        // TODO
    }
}
