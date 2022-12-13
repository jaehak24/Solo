package com.example.demo.Controller;

import com.example.demo.Model.TodoResponse;
import com.example.demo.Service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RequestMapping("/")
@RestController
@Controller
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("CREATE");
        return null;
    }

    @GetMapping
    public ResponseEntity<TodoResponse> readById(){
        System.out.println("Read By Id");
        return null;
    }

    @GetMapping
    public ResponseEntity<TodoResponse> readAll(){
        System.out.println("Read ALL");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(){
        System.out.println("UPDATE");
        return null;
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<TodoResponse> deleteByID(){
        System.out.println("Delete By Id");
        return null;
    }

    @DeleteMapping()
    public  ResponseEntity<TodoResponse> deleteByAll(){
        System.out.println("Delete All");
        return null;
    }
}
