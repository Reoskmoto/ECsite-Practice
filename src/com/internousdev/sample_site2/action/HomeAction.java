package com.internousdev.sample_site2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.BuyItemDAO;
import com.internousdev.sample_site2.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;

	public String execute(){
		String result="login";
		if(session.containsKey("id")){
			BuyItemDAO buyitemDAO=new BuyItemDAO();
			ProductInfoDTO productDTO=buyitemDAO.getproductinfo();
			session.put("id", productDTO.getId());
			session.put("itemname", productDTO.getItemname());
			session.put("price", productDTO.getPrice());
			session.put("item_image_path", productDTO.getItem_image_path());
			session.put("item_image_file", productDTO.getItem_image_file());

			result=SUCCESS;
		}
		return result;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
