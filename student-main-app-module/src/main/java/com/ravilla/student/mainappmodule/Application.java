package com.ravilla.student.mainappmodule;

import java.util.HashMap;
import java.util.Map;

import com.ravilla.student.dao.Dao;
import com.ravilla.student.entity.User;
import com.ravilla.student.userdao.UserDao;

public class Application {
    
    public static void main(String args[]) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Madhu"));
        users.put(2, new User("Rajesh"));
        users.put(3, new User("Ramesh"));
        users.put(4, new User("Umesh"));
        
        Dao<?> userDao = new UserDao(users);
        
        userDao.findAll().forEach(System.out::println);
    }
    
}
