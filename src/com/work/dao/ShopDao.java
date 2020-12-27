package com.work.dao;



import java.util.List;

import com.work.pojo.Shop;

public interface ShopDao {
	//����id��ѯ
	public Shop getById(int id);
	//ͨ�ò�ѯ
	public List<Shop> getAll();
	//��
	public void sava(Shop shop);
	//ɾ
	public void delete(int id);
	//��
	public void update(Shop shop);

}
