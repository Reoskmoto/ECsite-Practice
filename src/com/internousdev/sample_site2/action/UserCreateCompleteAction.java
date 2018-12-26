package com.internousdev.sample_site2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String userid;
	private String password;
	private String username;
	private String mail;
	public Map<String,Object>session;
	private UserCreateCompleteDAO usercreatecompleteDAO=new UserCreateCompleteDAO();

	public String execute()throws SQLException{
		usercreatecompleteDAO.createuser(session.get("userid").toString(),
				session.get("password").toString(),
				session.get("username").toString(),
				session.get("mail").toString());
		String result=SUCCESS;
		return result;
	}
	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid=userid;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail=mail;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
