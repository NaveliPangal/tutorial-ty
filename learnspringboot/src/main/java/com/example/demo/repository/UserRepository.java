package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.userDetails;

public interface UserRepository extends JpaRepository<userDetails, Integer>{

}
