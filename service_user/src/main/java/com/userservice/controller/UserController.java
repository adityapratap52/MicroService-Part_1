package com.userservice.controller;

import com.userservice.model.User;
import com.userservice.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Integer userId) {

        User user = userServiceImp.getUser(userId);     //as

        List contacts = restTemplate.getForObject("http://contact-service/contact/" + user.getUserId(), List.class);

        user.setContacts(contacts);

        return user;
    }
}
