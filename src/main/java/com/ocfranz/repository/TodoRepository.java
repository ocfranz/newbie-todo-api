package com.ocfranz.repository;

import com.ocfranz.models.Todo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends ReactiveMongoRepository<Todo, String> {
}
