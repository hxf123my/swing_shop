package com.work.dao;

import com.work.pojo.User;

public interface LoginDao {
	// �����û����������ѯ
	public User getByname(String name,String password);

}
