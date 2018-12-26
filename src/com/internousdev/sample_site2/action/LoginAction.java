package com.internousdev.sample_site2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.BuyItemDAO;
import com.internousdev.sample_site2.dao.LoginDAO;
import com.internousdev.sample_site2.dto.LoginDTO;
import com.internousdev.sample_site2.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements SessionAware{

	private String userid;
	private String password;
	private String username;
	private String adminstts;
	private String item_image_path;
	private String item_image_file;
	public Map<String,Object>session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private BuyItemDAO buyitemDAO=new BuyItemDAO();

	public String execute(){
		String result=ERROR;
		loginDTO=loginDAO.getuserinfo(userid, password);
		session.put("loginuser",loginDTO);

		if(((LoginDTO)session.get("loginuser")).getLoginflg()){
			result=SUCCESS;
			ProductInfoDTO productDTO=buyitemDAO.getproductinfo();
			session.put("user_id", loginDTO.getUserid());
			session.put("id", productDTO.getId());
			session.put("itemname", productDTO.getItemname());
			session.put("price", productDTO.getPrice());
			session.put("username", loginDTO.getUsername());
			session.put("item_image_path", productDTO.getItem_image_path());
			session.put("item_image_file", productDTO.getItem_image_file());
			return result;
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
	public String getAdminstts(){
		return adminstts;
	}
	public String getItem_image_path(){
		return item_image_path;
	}
	public void setItem_image_path(String item_image_path){
		this.item_image_path=item_image_path;
	}
	public String getItem_image_file(){
		return item_image_file;
	}
	public void setItem_image_file(String item_image_file){
		this.item_image_file=item_image_file;
	}
	public void setAdminstts(String adminstts){
		this.adminstts=adminstts;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
