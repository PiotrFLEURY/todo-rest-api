package com.example.todoapi.model;

import org.springframework.data.annotation.Id;

public record Todo(
        @Id
        Long id,
        String description,
        Boolean completed
) {
}
