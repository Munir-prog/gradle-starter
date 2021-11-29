package com.mprog.dao;

import com.mprog.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                new User(13, "Ivan"),
                new User(23, "Sveta"),
                new User(33, "Pete")
        );
    }
}
