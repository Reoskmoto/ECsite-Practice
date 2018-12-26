package com.internousdev.sample_site2.dto;

public class LoginDTO {

	private String userid;
	private String username;
	private String password;
	private String adminstts;
	private boolean loginflg=false;

	public String getUserid(){
		return userid;
	}
	public void setUserid(String userid){
		this.userid=userid;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getAdminstts(){
		return adminstts;
	}
	public void setAdminstts(String adminstts){
		this.adminstts=adminstts;
	}
	public boolean getLoginflg(){
		return loginflg;
	}
	public void setLoginflg(boolean loginflg){
		this.loginflg=loginflg;
	}
}
