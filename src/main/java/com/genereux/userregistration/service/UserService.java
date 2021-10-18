package com.genereux.userregistration.service;


import com.genereux.userregistration.entity.User;
import com.genereux.userregistration.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
