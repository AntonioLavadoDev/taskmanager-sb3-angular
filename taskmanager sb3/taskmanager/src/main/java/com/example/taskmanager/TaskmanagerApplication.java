package com.example.taskmanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.repositories.TaskRepository;

@SpringBootApplication
public class TaskmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApplication.class, args);
	}

	
	//Agregar tareas iniciales al arrancar la aplicación
	@Bean
	public CommandLineRunner init(TaskRepository taskRepository){
		return args -> {
			taskRepository.save(new Task(0, "Task 1", "Description 1", false));
			taskRepository.save(new Task(0, "Task 2", "Description 2", false));
			taskRepository.save(new Task(0, "Task 3", "Description 3", false));
		};
	}

}
