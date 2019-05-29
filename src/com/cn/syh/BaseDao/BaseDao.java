package com.cn.syh.BaseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	public String url = "jdbc:mysql://localhost:3306/luntan";
	public String user="root";
	public String pwd="root";
	public Connection getcon(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
