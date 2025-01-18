package com.example.taskmanager.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.repositories.TaskRepository;

@RestController
public class TaskController {

    private final TaskRepository taskRepository;

    // Constructor para inyectar el repositorio
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Task Manager";
    }

    // Endpoint para obtener todas las tareas
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

}
