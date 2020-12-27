package com.work.pojo;

public class User {
	private String name;   //�û���
	private String password; //����
	
	//���췽��
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public User() {
		super();
	}

	//��װ
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
	
	//��ӡ·��
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	

}
