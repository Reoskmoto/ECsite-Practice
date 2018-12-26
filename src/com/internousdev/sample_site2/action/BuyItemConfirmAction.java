package com.internousdev.sample_site2.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private BuyItemCompleteDAO buyitemDAO=new BuyItemCompleteDAO();

	public String execute()throws SQLException{
		buyitemDAO.buyitem(session.get("id").toString(),
				session.get("user_id").toString(),
				session.get("totalprice").toString(),
				session.get("count").toString(),
				session.get("pay").toString());
		String result=SUCCESS;
		return result;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
