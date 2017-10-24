/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.service;

import com.taufik.dao.UserDao;
import com.taufik.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Taufik
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;
    
    
    @Override
    @Transactional
    public void saveUser(User user) {
       dao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    @Transactional
    public List<User> getAllUser() {
        return dao.getAllUser();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return dao.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        dao.deleteUser(id);
    }
    
}
