package com.work.service.impl;

import java.util.List;

import com.work.dao.impl.ShopDaoImpl;
import com.work.pojo.Shop;
import com.work.service.ShopService;

public class ShopServiceImpl implements ShopService {
   ShopDaoImpl shopDaoImpl = new ShopDaoImpl();
	@Override
	public Shop getById(int id) {
		// TODO Auto-generated method stub
		return shopDaoImpl.getById(id);
	}

	@Override
	public List<Shop> getAll() {
		// TODO Auto-generated method stub
		return shopDaoImpl.getAll();
	}

	@Override
	public void sava(Shop shop) {
		// TODO Auto-generated method stub
		shopDaoImpl.sava(shop);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		shopDaoImpl.delete(id);
		
	}

	@Override
	public void update(Shop shop) {
		// TODO Auto-generated method stub
		shopDaoImpl.update(shop);
		
	}

}
