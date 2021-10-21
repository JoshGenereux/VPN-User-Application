package com.genereux.userregistration.dao;

import com.genereux.userregistration.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
