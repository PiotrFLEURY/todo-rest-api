package com.example.todoapi.repositories;

import com.example.todoapi.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, Long> {
}
