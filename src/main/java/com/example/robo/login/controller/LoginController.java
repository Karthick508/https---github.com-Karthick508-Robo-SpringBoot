package com.example.robo.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.robo.login.entity.User;
import com.example.robo.login.service.UsersService;

@RestController
public class LoginController {

    @Autowired
    UsersService usersService;

    @PostMapping("/login")
    public List<LovJson> getLovListAsArrays(@RequestBody User body, final HttpServletRequest request,
            HttpServletResponse response) {


                usersService.deleteUser(body);

        return null;
    }
}
