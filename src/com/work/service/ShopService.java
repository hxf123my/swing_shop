package com.work.service;

import java.util.List;

import com.work.pojo.Shop;

public interface ShopService {
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
