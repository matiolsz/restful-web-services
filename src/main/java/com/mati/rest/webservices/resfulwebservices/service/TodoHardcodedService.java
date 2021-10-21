package com.mati.rest.webservices.resfulwebservices.service;

import com.mati.rest.webservices.resfulwebservices.model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter,"mati","lear angular", new Date(), false));
        todos.add(new Todo(++idCounter,"mati","lear to code", new Date(), false));
        todos.add(new Todo(++idCounter,"mati","lear spring", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if(todo == null) return null;

        if(todos.remove(todo)) {
            return todo;
        }
        return null;
    }

    public Todo save(Todo todo) {
        if(todo.getId()==-1 || todo.getId() == 0) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo findById(long id) {
        for(Todo todo: todos){
            if(todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }



}
