package com.work.dao;



import java.util.List;

import com.work.pojo.Shop;

public interface ShopDao {
	//根据id查询
	public Shop getById(int id);
	//通用查询
	public List<Shop> getAll();
	//增
	public void sava(Shop shop);
	//删
	public void delete(int id);
	//改
	public void update(Shop shop);

}
