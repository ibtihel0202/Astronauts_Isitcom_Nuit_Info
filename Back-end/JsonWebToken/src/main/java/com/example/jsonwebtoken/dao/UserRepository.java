package com.example.jsonwebtoken.dao;

import com.example.jsonwebtoken.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface UserRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
}
