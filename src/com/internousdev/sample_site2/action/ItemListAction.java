package com.internousdev.sample_site2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dao.ItemListDAO;
import com.internousdev.sample_site2.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class ItemListAction extends ActionSupport{

	private List<ProductInfoDTO>itemlistDTO=new ArrayList<ProductInfoDTO>();

	public String execute()throws SQLException{
		ItemListDAO itemlistDAO=new ItemListDAO();
		itemlistDTO=itemlistDAO.getitemlist();
		String result=SUCCESS;
		return result;
	}
	public List<ProductInfoDTO>getItemlist(){
		return itemlistDTO;
	}
	public void setItemlist(List<ProductInfoDTO>itemlist){
		this.itemlistDTO=itemlist;
	}
}
