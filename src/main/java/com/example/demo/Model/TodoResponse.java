package com.example.demo.Model;


public class TodoResponse {
    private Long Id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(ToDoEntity toDoEntity){
        this.Id=toDoEntity.getId();
        this.title=toDoEntity.getTitle();
        this.order=toDoEntity.getOrder();
        this.completed=toDoEntity.getCompleted();
        //테스트 용
        this.url="http://localhost:8080/"+this.Id;
    }
}
