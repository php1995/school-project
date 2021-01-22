package com.example.chalz.service;

import com.example.chalz.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksService implements TasksRepository {
    @Autowired
    TasksRepository tasksRepository;
}
