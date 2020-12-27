package com.work.dbutil;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Util {
	public Connection conn;
	public PreparedStatement ps;
	
	// 打开连接
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lai","root","root");
	}
	
	//关闭连接
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			if(ps!=null){
				ps.close();
			}
			if(rs!=null){
				rs.close();
			}
			if(conn!=null&&!conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 通用的查
	 */
	public ResultSet commonQuery(String sql,Object...params){
		try {
			//创建加载与连接
			conn=getConnection();
			//操作数据
			ps=(PreparedStatement) conn.prepareStatement(sql);
			setValues(ps,params);
			return (ResultSet) ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 通用的增，删，改
	 * @param ps
	 * @param params
	 * @throws SQLException
	 */
	public void commonUpdate(String sql,Object...params){
		try {
			//创建加载与连接
			conn=getConnection();
			//操作数据
			ps=(PreparedStatement) conn.prepareStatement(sql);
			setValues(ps,params);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn, ps, null);
		}
	}

	private void setValues(PreparedStatement ps, Object...params) throws SQLException {
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
		}
		
	}

}
