package com.cn.syh.Dao;

import java.util.Date;
import java.util.List;

import com.cn.syh.entity.User;

public interface Dao {
		public int zc(String name,String pwd,String email);
		
		public String dl(String name,String pwd);
		
		public List<User> sel(String uname);
		
		public List<User> pd(String name);
		
		public List<User> sjrcx(Object name);
		
		public int upzt(int msgid);
		
		public int del(int msgid);
		
		public int fxx(String uname,String title,String msgcontent,String jsr,Date date);
		
}
