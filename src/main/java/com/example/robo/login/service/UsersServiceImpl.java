package com.example.robo.login.service;

import java.util.List;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.robo.login.entity.User;
import com.example.robo.login.repository.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepo usersRepo;

    @Override
    public List<User> getUserName() {

        List<User> user = usersRepo.findAllUsers();
        return user;
    }
}
