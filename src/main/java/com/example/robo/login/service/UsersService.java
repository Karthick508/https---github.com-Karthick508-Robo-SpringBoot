package com.example.robo.login.service;


import java.util.List;

import com.example.robo.login.entity.User;

public interface UsersService {

    Boolean ValidateUser(User user);

    public List<User> executeCursorTypeProcedure();
}
