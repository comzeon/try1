package com.ssm.ioc_di.UserService.Impl;

import com.ssm.ioc_di.UserDAO.UserDAO;
import com.ssm.ioc_di.UserService.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    public void login(){
        this.userDAO.login();
        System.out.println("Call of UserService.login()!");
    }
}
