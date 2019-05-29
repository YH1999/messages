package com.cn.syh.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cn.syh.BaseDao.BaseDao;
import com.cn.syh.Dao.Dao;
import com.cn.syh.entity.User;

public class DaoImp extends BaseDao implements Dao {
		//注册
	
	@Override
	public int zc(String name, String pwd,String email) {
		PreparedStatement ps = null;
		int res = 0;
		Connection con = getcon();
		try {
			String sql="insert into user(uname,upwd,email) values('"+name+"','"+pwd+"','"+email+"')";
			ps = con.prepareStatement(sql);
			res= ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
		//登录
	@Override
	public String dl(String uname, String upwd) {
		String Uname=null;
		String Upwd=null;
		PreparedStatement ps= null;
		Connection con=getcon();
		try {
			String sql = "SELECT uname,upwd FROM USER WHERE uname='"+uname+"' AND upwd='"+upwd+"'";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next()){
				Uname= rs.getString("uname");
				Upwd=rs.getString("upwd");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Uname+Upwd;
	}
	
	//查询除登录用户外
	@Override
	public List<User> sel(String uname) {
		List<User> list = new ArrayList<User>();
		PreparedStatement ps= null;
		Connection con=getcon();
		try {
			String sql = "SELECT uname FROM USER WHERE uname != '"+uname+"'";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next()){
				User u = new User();
				u.setUname(rs.getString("uname"));
				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//注册提示
	@Override
	public List<User> pd(String name) {
			List<User> list = new ArrayList<User>();
			PreparedStatement ps= null;
			Connection con=getcon();
			String sql = "SELECT uname FROM USER WHERE uname='"+name+"'";
			try {
				ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs != null && rs.next()){
					User u = new User();
					u.setUname(rs.getString("uname"));
					list.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return list;
	}
	//收件人发信息
	@Override
	public List<User> sjrcx(Object name) {
		List<User> list = new ArrayList<User>();
		PreparedStatement ps= null;
		Connection con=getcon();
		String sql = "select msgid,title,msgcontent,state,uname,date from msg where sendto='"+name+"'";
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next()){
				User us = new User();
				us.setMsgid(rs.getInt("msgid"));
				us.setTitle(rs.getString("title"));
				us.setMsgcontent(rs.getString("msgcontent"));
				us.setState(rs.getInt("state"));
				us.setUname(rs.getString("uname"));
				us.setDate(rs.getDate("Date"));
				list.add(us);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//修改阅读状态
	@Override
	public int upzt(int msgid) {
		int  res= 0;
		PreparedStatement ps= null;
		Connection con=getcon();
		String sql="update msg set state='1' where msgid = '"+msgid+"'";
		try {
			ps = con.prepareStatement(sql);
			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	//删除消息
	@Override
	public int del(int msgid) {
		int re = 0;
		PreparedStatement ps= null;
		Connection con=getcon();
		String sql="DELETE FROM msg WHERE msgid= ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, msgid);
			re = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return re;
	}
	//发消息
	@Override
	public int fxx(String name, String title, String msgcontent, String sjr,Date date) {
			int re = 0;
			PreparedStatement ps= null;
			Connection con=getcon();
			String sql="INSERT INTO msg( uname,title,msgcontent,sendto,DATE) VALUES (?,?,?,?,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1,name);
				ps.setString(2,title);
				ps.setString(3,msgcontent);
				ps.setString(4,sjr);
				ps.setObject(5,date);
				re = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return re;
	}
	/*@Override
	public int hf(User u) {
		int res= 0;
		PreparedStatement ps= null;
		Connection con=getcon();
		String sql="INSERT INTO msg( uname,title,msgcontent,sendto,DATE) VALUES (?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,u.getUname());
			ps.setString(2,u.getTitle());
			ps.setString(3,u.getMsgcontent());
			ps.setString(4,u.getSendto());
			ps.setObject(5,u.getDate());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;*/
	
	
}

