package com.mprog.service;

import com.mprog.dao.UserDao;
import com.mprog.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
