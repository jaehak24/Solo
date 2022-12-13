package com.example.demo.Service;

import com.example.demo.Model.ToDoEntity;
import com.example.demo.Repository.TodoRepository;
import com.example.demo.Model.TodoRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.Id;
import java.util.List;


@AllArgsConstructor
@Service
public class TodoService {
    @Autowired
    private final TodoRepository todoRepository;

    //create
    public ToDoEntity add(ToDoEntity request){
        ToDoEntity toDoEntity=new ToDoEntity();

        toDoEntity.setTitle(request.getTitle());
        toDoEntity.setOrder(request.getOrder());
        toDoEntity.setCompleted(request.getCompleted());

        return this.todoRepository.save(toDoEntity);
    }

    //Read byID
    public ToDoEntity searchById(Long Id){
        return this.todoRepository.findById(Id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //Read All
    public List<ToDoEntity> searchAll(){
        return this.todoRepository.findAll();
    }

    //Update
    public ToDoEntity updateByID(Long Id, TodoRequest request){
        ToDoEntity toDoEntity=this.searchById(Id);
        if(request.getTitle() !=null){
            toDoEntity.setTitle(request.getTitle());
        }
        if (request.getTodo_order() !=null)
            toDoEntity.setOrder(request.getTodo_order());
        if (request.getCompleted()!=null)
            toDoEntity.setCompleted(request.getCompleted());
        return this.todoRepository.save(toDoEntity);
    }

    //Delete by ID
    public void deleteByID(Long id){
        this.todoRepository.deleteById(id);
    }
    public void deleteAll(Long id){
        this.todoRepository.deleteAll();
    }



}
