package com.ssm.ioc_di.UserDAO.Impl;

import com.ssm.ioc_di.UserDAO.UserDAO;

public class UserDAOImpl implements UserDAO {
    public void login(){
        System.out.println("Call of UserDAO.login()!");
    }
}
