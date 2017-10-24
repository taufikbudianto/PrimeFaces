/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.faces.beans;

import com.taufik.model.User;
import com.taufik.service.UserService;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Taufik
 */
@ManagedBean
@ViewScoped
public class RegisterUser {
    
    @Autowired
    private UserService serv;
    private User user = new User();

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        user.setId(4);
        this.user = user;
    }
    public void save() {
        serv.saveUser(user);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Welcome " + getUser().getName()));
    }

    /**
     * @return the serv
     */
    public UserService getServ() {
        return serv;
    }

    /**
     * @param serv the serv to set
     */
    public void setServ(UserService serv) {
        this.serv = serv;
    }
    
}
