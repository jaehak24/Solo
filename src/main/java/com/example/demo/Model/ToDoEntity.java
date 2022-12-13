package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title; //TODO 이름

    @Column(name = "todoOrder",nullable = false)
    private long order; //할 일 순서

    @Column(nullable = false)
    private Boolean completed; //실행 여부 확인
}
