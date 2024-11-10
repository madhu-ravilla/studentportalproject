package com.ravilla.student.userdao;

import com.ravilla.student.dao.Dao;
import com.ravilla.student.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;

    public UserDao() {
        users = new HashMap<>();
    }

    public UserDao(Map<Integer, User> users) {
        this.users = users;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }
}