package com.hcl.pp.service;

import com.hcl.pp.model.User;

public interface SecurityService {
	public boolean authenticateUser(User user);
}
