package com.ocfranz.controllers;

import com.ocfranz.models.Todo;
import com.ocfranz.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public Flux<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
    @PostMapping("/todos")
    public Mono<Todo> createTodo(@Validated @RequestBody Todo todo){

        return todoRepository.save(todo);
    }
}
