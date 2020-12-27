package com.work.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;
import com.work.dao.ShopDao;
import com.work.dbutil.Util;
import com.work.pojo.Shop;

public class ShopDaoImpl implements ShopDao {

	@Override
	public Shop getById(int id) {
		Shop shop = null;
		Util util = new Util();
		ResultSet rs = null;
		rs = util.commonQuery("select * from shop where id=?", id);
		try {
			if (rs.next()) {
				shop = new Shop(rs.getInt("id"),rs.getString("Sname"),rs.getString("kind"),rs.getDouble("price"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			util.close(null, null, rs);
		}
		return shop;
	}

	@Override
	public List<Shop> getAll() {
		List<Shop> list = new ArrayList<Shop>();
		Util util = new Util();
		ResultSet rs = null ;
		rs=util.commonQuery("select*from shop ", null) ;
		try {
			while (rs.next()) {
				Shop shop = new Shop(rs.getInt("id"),rs.getString("Sname"),rs.getString("kind"),rs.getDouble("price"));
				list.add(shop);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			util.close(null, null, rs);
		}
		return list;
	}

//	public static void main(String[] args) {
//		ShopDaoImpl shopDaoImpl = new ShopDaoImpl();
//		List<Shop> list = shopDaoImpl.getAll();
//		for(Shop shop: list) {
//			System.out.println("…Ã∆∑£∫"+shop);
//		}
//	}
	@Override
	public void sava(Shop shop) {
		Util util = new Util();
		util.commonUpdate("insert into shop(id,Sname,kind,price) values(?,?,?,?)", shop.getId()
				,shop.getSname(),shop.getKind(),shop.getPrice());
		
	}

	@Override
	public void delete(int id) {
		Util util = new Util();
		util.commonUpdate("delete from shop where id=?", id);
		
	}

	@Override
	public void update(Shop shop) {
		Util util = new Util();
		util.commonUpdate("update shop set Sname=?,kind=?,price=? where id=?",shop.getSname()
				,shop.getKind(),shop.getPrice(),shop.getId());
		
	}

}
