package com.cn.syh.entity;

import java.util.Date;

public class User {
		private String uname;
		private String upwd;
		private String email;
		private int msgid;
		private String title;
		private String msgcontent;
		private int state;
		private String sendto;
		private Date date;
		public int getMsgid() {
			return msgid;
		}
		public void setMsgid(int msgid) {
			this.msgid = msgid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMsgcontent() {
			return msgcontent;
		}
		public void setMsgcontent(String msgcontent) {
			this.msgcontent = msgcontent;
		}
		public int getState() {
			return state;
		}
		public void setState(int state) {
			this.state = state;
		}
		public String getSendto() {
			return sendto;
		}
		public void setSendto(String sendto) {
			this.sendto = sendto;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getUpwd() {
			return upwd;
		}
		public void setUpwd(String upwd) {
			this.upwd = upwd;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
