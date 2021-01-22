package com.example.chalz.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/tasks", method = RequestMethod.GET)
@ResponseBody
public class TasksController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/addTask")
    public String
    
    @GetMapping("/{id}")
    public String task() {
        return "index";
    }
}
