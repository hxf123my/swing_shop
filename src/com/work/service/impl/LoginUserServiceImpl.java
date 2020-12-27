package com.work.service.impl;

import com.work.dao.impl.LoginDaoImpl;
import com.work.pojo.User;
import com.work.service.LoginUserService;

public class LoginUserServiceImpl implements LoginUserService {
   LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
	@Override
	public User name(String name, String password) {
		// TODO Auto-generated method stub
		return loginDaoImpl.getByname(name, password);
	}

}
