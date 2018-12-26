package com.internousdev.sample_site2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class BuyItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private int stock;
	private String pay;
	private String price;
	private String item_image_path;
	private String item_image_file;

	public String execute(){
		String result=SUCCESS;
		session.put("stock", stock);
		int intstock=Integer.parseInt(session.get("stock").toString());
		int intprice=Integer.parseInt(session.get("price").toString());
		session.put("total_price",intstock*intprice);
		String payment;
		if(pay.equals("1")){
			payment="現金払い";
			session.put("pay", payment);
		}else if(pay.equals("2")){
			payment="クレジットカード";
			session.put("pay", payment);
		}else{
			payment="代引き";
			session.put("pay", payment);
		}
		return result;
	}
	public void setCount(int stock){
		this.stock=stock;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getitem_image_path(){
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
}
