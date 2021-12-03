package com.example.jsonwebtoken.web;

import com.example.jsonwebtoken.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestRestController {
    @Autowired
    private TaskRepository taskRepository ;


}
