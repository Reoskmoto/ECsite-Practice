package com.internousdev.sample_site2.dto;

public class UserInfoDTO {

	private String id;
	private String userid;
	private String password;
	private String username;
	private String mail;
	private String insert_date;

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
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
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
