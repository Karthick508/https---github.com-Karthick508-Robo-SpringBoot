package com.example.robo.login.controller;

// import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import net.minidev.json.JSONObject;

// import org.json.JSONObject;
// import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.robo.login.entity.User;
// import com.example.robo.login.entity.User;
import com.example.robo.login.service.UsersService;

@CrossOrigin(origins = "${client.url}")
@RestController
public class LoginController {

    @Autowired
    UsersService usersService;

    @PostMapping("/login")
    public Boolean validateUser(@RequestBody User user, final HttpServletRequest request,
            HttpServletResponse response) {

        Boolean boolean1 = usersService.ValidateUser(user);

        return boolean1;
    }
}
