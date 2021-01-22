package com.example.chalz.repository;

import com.example.chalz.model.TasksModel;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<TasksModel, Long> {

}
