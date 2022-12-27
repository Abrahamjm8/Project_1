package com.example.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{
    
}
