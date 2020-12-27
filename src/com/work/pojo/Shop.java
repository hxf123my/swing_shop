package com.work.pojo;

public class Shop {
	private int id;  //编号
	private String Sname;  //名称
	private String kind;  //种类
	private double price; //价格
	
	//构造方法
	public Shop() {
		super();
	}


	public Shop(int id, String Sname, String kind, double price) {
		super();
		this.id = id;
		this.Sname = Sname;
		this.kind = kind;
		this.price = price;
	}

	//封装

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	


	//打印路径
	@Override
	public String toString() {
		return "Shop [id=" + id + ", Sname=" + Sname + ", kind=" + kind + ", price=" + price + "]";
	}


	
	
	

}
