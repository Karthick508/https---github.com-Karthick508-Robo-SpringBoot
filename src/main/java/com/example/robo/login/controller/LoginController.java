package com.example.robo.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /**
     * @param json
     * @param request
     * @param response
     * @return List<LovJson>
     */
    @PostMapping("/lovListParellel")
    public List<LovJson> getLovListAsArrays(@RequestBody Object[] stuffs, final HttpServletRequest request,
            HttpServletResponse response) {

        return null;
    }
}
