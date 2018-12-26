package com.internousdev.sample_site2.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class InquiryConfirmAction extends ActionSupport implements SessionAware{

	private Map<String,Object>session;
	private String name;
	private String mail;
	private String qtype;
	private String body;

	public String execute(){
		String result=SUCCESS;
		session.put("name", name);
		session.put("mail", mail);
		session.put("qtype", qtype);
		session.put("body", body);
		return result;
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
