package com.internousdev.sample_site2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String userid;
	private String password;
	private String username;
	private String mail;
	public Map<String,Object>session;
	private String errormessage;

	public String execute(){
		String result=SUCCESS;

		if(!(userid.equals(""))
				&& !(password.equals(""))
				&& !(username.equals(""))
				&& !(mail.equals(""))){
			session.put("userid", userid);
			session.put("password", password);
			session.put("username", username);
			session.put("mail", mail);
		}else{
			setErrormessage("未入力項目があるようです");
			result=ERROR;
		}
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
	public String getErrormessage(){
		return errormessage;
	}
	public void setErrormessage(String errormessage){
		this.errormessage=errormessage;
	}
}
