package com.userservice.service;

import com.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    // fake user list
    List<User> list = List.of(
            new User(1311, "Aditya", "112121"),
            new User(1312, "Prabhat", "45445"),
            new User(1313, "Prateek", "5445445")
    );

    @Override
    public User getUser(Integer id) {

        User user1 = this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
        return user1;
    }
}
