package com.internousdev.sample_site2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample_site2.dao.InquiryDAO;
import com.opensymphony.xwork2.ActionSupport;
public class InquiryCompleteAction extends ActionSupport implements SessionAware{

	private String name;
	private String mail;
	private String qtype;
	private String body;
	private Map<String,Object>session;

	public String execute()throws SQLException{
		InquiryDAO dao=new InquiryDAO();
		dao.insert(session.get("name").toString(),
				session.get("mail").toString(),
				session.get("qtype").toString(),
				session.get("body").toString());
		String ret=SUCCESS;
		return ret;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail=mail;
	}
	public String getQtype(){
		return qtype;
	}
	public void setQtype(String qtype){
		this.qtype=qtype;
	}
	public String getBody(){
		return body;
	}
	public void setBody(String body){
		this.body=body;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
