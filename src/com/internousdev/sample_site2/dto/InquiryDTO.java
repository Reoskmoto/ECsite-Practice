package com.internousdev.sample_site2.dto;

public class InquiryDTO {

	private String name;
	private String mail;
	private String qtype;
	private String body;
	private String insert_date;

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
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
