package com.example.chalz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tasks")
public class TasksController {

    @GetMapping("/")
    public String apples() {
        return "tasks";
    }
}
