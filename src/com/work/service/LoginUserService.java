package com.work.service;

import com.work.pojo.User;

public interface LoginUserService {
	/**
	 * 根据用户名和密码查询
	 */
	public User name(String name,String password);
}
