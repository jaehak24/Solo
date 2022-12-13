package com.example.demo.Repository;

import com.example.demo.Model.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepository extends JpaRepository<ToDoEntity, Long> {


}
