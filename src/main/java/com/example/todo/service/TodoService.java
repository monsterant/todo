package com.example.todo.service;

import com.example.todo.dto.TodoCreateRequest;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public void create(TodoCreateRequest request) {
        Todo todoCreate = new Todo(request.getTitle());
        todoRepository.save(todoCreate);
    }
}
