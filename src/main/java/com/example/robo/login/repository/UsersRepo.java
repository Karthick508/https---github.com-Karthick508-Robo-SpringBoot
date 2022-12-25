package com.example.robo.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.robo.login.entity.User;

@Repository
public interface UsersRepo extends JpaRepository<User, Long> {

}
