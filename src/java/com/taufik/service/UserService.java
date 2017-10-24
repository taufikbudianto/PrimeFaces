/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.service;

import com.taufik.model.User;
import java.util.List;

/**
 *
 * @author Taufik
 */
public interface UserService {
    public void saveUser(User user);
    public void updateUser(User user);
    public List<User>getAllUser();
    public User getUserById(int id);
    public void deleteUser(int id);
}
