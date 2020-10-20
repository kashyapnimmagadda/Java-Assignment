package com.hcl.pp.dao;

import com.hcl.pp.model.User;

public interface UserDAO {
	public boolean addUser(User user);
	public boolean authenticateUser(User user);
}
