package com.jt.sso.service;

import com.jt.sso.pojo.User;

public interface UserService {
	public boolean findCheckUser(String param, Integer type);

	public void saveUser(User user);

	public String findUserByUP(User user);
}
