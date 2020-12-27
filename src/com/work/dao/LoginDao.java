package com.work.dao;

import com.work.pojo.User;

public interface LoginDao {
	// 根据用户名和密码查询
	public User getByname(String name,String password);

}
