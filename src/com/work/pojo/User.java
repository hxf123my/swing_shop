package com.work.pojo;

public class User {
	private String name;   //用户名
	private String password; //密码
	
	//构造方法
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public User() {
		super();
	}

	//封装
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//打印路径
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	

}
