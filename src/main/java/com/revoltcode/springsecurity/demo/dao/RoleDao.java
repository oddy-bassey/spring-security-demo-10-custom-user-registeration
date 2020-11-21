package com.revoltcode.springsecurity.demo.dao;

import com.revoltcode.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
