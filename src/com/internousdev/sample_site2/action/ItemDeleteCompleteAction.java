package com.internousdev.sample_site2.action;
import java.sql.SQLException;

import com.internousdev.sample_site2.dao.ItemListDAO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemDeleteCompleteAction extends ActionSupport{

	private String message;

	public String execute()throws SQLException{
		String result=ERROR;
		ItemListDAO itemdelete=new ItemListDAO();
		int ret=itemdelete.itemdelete();

		if(ret>0){
			setMessage("商品を削除しました");
		}else if(ret==0){
			setMessage("商品削除に失敗しました");
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
