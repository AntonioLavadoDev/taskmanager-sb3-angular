package com.example.taskmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Task Manager";
    }

}
