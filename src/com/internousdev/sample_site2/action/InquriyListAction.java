package com.internousdev.sample_site2.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dao.InquiryDAO;
import com.internousdev.sample_site2.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;
public class InquriyListAction extends ActionSupport{

	private List<InquiryDTO> inquirylist=new ArrayList<InquiryDTO>();

	public String execute()throws SQLException{
		InquiryDAO dao=new InquiryDAO();
		inquirylist=dao.getinquirylist();
		String result=SUCCESS;
		return result;
	}
	public List<InquiryDTO>getInquirylist(){
		return inquirylist;
	}
	public void setInquirylist(List<InquiryDTO>inquirylist){
		this.inquirylist=inquirylist;
	}
}
