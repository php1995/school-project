package com.example.chalz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String author;
    private String title;
    private String task;
    private String solution;

    public Tasks(String author, String title, String task, String solution) {
        this.author = author;
        this.title = title;
        this.task = task;
        this.solution = solution;
    }
}
