package com.example.chalz.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tasks")
public class TasksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String author;
    private String task_title;
    private String task_description;
    private String task_solution;

    public TasksModel(String author, String task_title, String task_description, String task_solution) {
        this.author = author;
        this.task_title = task_title;
        this.task_description = task_description;
        this.task_solution = task_solution;
    }
}
