package com.internousdev.sample_site2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.ItemAddDAO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemAddCompleteAction extends ActionSupport implements SessionAware{

	private String itemname;
	private String itemdecription;
	private String price;
	private String stock;
	private String item_image_path;
	private String item_image_file;
	public Map<String,Object>session;
	private ItemAddDAO itemaddDAO=new ItemAddDAO();

	public String execute()throws SQLException{
		itemaddDAO.itemadd(session.get("itemname").toString(),
				session.get("itemdecription").toString(),
				session.get("price").toString(),
				session.get("stock").toString(),
				session.get("item_image_path").toString(),
				session.get("itemImageFileName").toString());
		String result=SUCCESS;
		return result;
	}
	public String getItemname(){
		return itemname;
	}
	public void setItemname(String itemname){
		this.itemname=itemname;
	}
	public String getItemdecription(){
		return itemdecription;
	}
	public void setItemdecription(String itemdecription){
		this.itemdecription=itemdecription;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getStock(){
		return stock;
	}
	public void setStock(String stock){
		this.stock=stock;
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
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}