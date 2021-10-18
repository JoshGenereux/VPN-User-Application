package com.genereux.userregistration.dao;

import com.genereux.userregistration.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
