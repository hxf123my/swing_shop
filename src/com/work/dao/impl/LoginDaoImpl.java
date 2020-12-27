package com.work.dao.impl;

import java.sql.SQLException;

import com.mysql.jdbc.ResultSet;

import com.work.dao.LoginDao;
import com.work.dbutil.Util;
import com.work.pojo.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User getByname(String name, String password) {
		// TODO Auto-generated method stub
		User user = null;
		Util util = new Util();
		ResultSet rs =null;
		rs = util.commonQuery("select * from user where name=? and password=?", name,password);
		try {
			if (rs.next()) {
				user = new User(rs.getString("name"),rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			util.close(null, null, rs);
		}
		return user;
	}

}
