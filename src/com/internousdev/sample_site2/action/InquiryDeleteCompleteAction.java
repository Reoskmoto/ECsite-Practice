package com.internousdev.sample_site2.action;
import java.sql.SQLException;

import com.internousdev.sample_site2.dao.InquiryDAO;
import com.opensymphony.xwork2.ActionSupport;
public class InquiryDeleteCompleteAction extends ActionSupport{

	private String message;

	public String execute()throws SQLException{
		String result=ERROR;
		InquiryDAO inquirydao=new InquiryDAO();
		int ret=inquirydao.inquirydelete();

		if(ret>0){
			setMessage("問い合わせ削除完了");
		}else if(ret==0){
			setMessage("削除失敗");
		}
		result=SUCCESS;
		return result;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
}
