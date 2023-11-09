package org.carrental.service;

import org.carrental.dao.UserDAO;
import org.carrental.domain.User;

public class AunthenticationService {

    private final UserDAO userDao = new UserDAO();

    public Boolean checkLogin(String username, String password)
    {
       User user =  userDao.getbyUsernameAndPassword(username,password);

        if (user != null)
        {
            return true;
        }

        return false;
    }



}
