package com.example.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    
} 
