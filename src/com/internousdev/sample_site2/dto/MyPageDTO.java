package com.internousdev.sample_site2.dto;

public class MyPageDTO {

	private String itemname;
	private String totalprice;
	private String totalcount;
	private String pay;
	private String username;
	private String id;
	private String insert_date;

	public String getItemname(){
		return itemname;
	}
	public void setItemname(String itemname){
		this.itemname=itemname;
	}
	public String getTotalprice(){
		return totalprice;
	}
	public void setTotalprice(String totalprice){
		this.totalprice=totalprice;
	}
	public String getTotalcount(){
		return totalcount;
	}
	public void setTotalcount(String totalcount){
		this.totalcount=totalcount;
	}
	public String getPay(){
		return pay;
	}
	public void setString(String pay){
		this.pay=pay;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
