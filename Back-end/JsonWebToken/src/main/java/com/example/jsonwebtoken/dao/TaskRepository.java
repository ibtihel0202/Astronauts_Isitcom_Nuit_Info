package com.example.jsonwebtoken.dao;

import com.example.jsonwebtoken.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface TaskRepository extends JpaRepository<Task, Long> {
}
