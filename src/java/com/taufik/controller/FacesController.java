/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.controller;

import com.taufik.model.User;
import com.taufik.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Taufik
 */
@Controller
public class FacesController {
    @Autowired
    UserService service;
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public ResponseEntity saveData(@RequestBody User user){
        System.err.println("data : "+user.getName());
        System.err.println("data : "+user.getAddress());
        System.err.println("data : "+user.getEmail());
        
        service.saveUser(user);
        
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public ResponseEntity updateData(@RequestBody User user){
        System.err.println("data : "+user.getName());
        System.err.println("data : "+user.getAddress());
        System.err.println("data : "+user.getEmail());
        
        service.updateUser(user);
        
        return new ResponseEntity(HttpStatus.OK);
    }
}
