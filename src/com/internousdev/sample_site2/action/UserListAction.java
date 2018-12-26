package com.internousdev.sample_site2.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dao.UserListDAO;
import com.internousdev.sample_site2.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class UserListAction extends ActionSupport{

	private List<UserInfoDTO> userlistdto=new ArrayList<UserInfoDTO>();

	public String execute()throws SQLException{
		UserListDAO userdao=new UserListDAO();
		userlistdto=userdao.getuserlist();
		String result=SUCCESS;
		return result;
	}
	public List<UserInfoDTO>getUserlist(){
		return userlistdto;
	}
	public void setUserlist(List<UserInfoDTO>userlist){
		this.userlistdto=userlist;
	}
}
