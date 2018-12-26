package com.internousdev.sample_site2.dto;

public class ProductInfoDTO {

	public String id;
	public String itemname;
	public String itemdescription;
	public String item_image_path;
	public String item_image_file;
	public String price;
	public String stock;
	public String insert_date;

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getItemname(){
		return itemname;
	}
	public void setItemname(String itemname){
		this.itemname=itemname;
	}
	public String getItemdescription(){
		return itemdescription;
	}
	public void setItemdescription(String itemdescription){
		this.itemdescription=itemdescription;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getStock(){
		return stock;
	}
	public void setStock(String stock){
		this.stock=stock;
	}
	public String getItem_image_path(){
		return item_image_path;
	}
	public void setItem_image_path(String item_image_path){
		this.item_image_path=item_image_path;
	}
	public String getItem_image_file(){
		return item_image_file;
	}
	public void setItem_image_file(String item_image_file){
		this.item_image_file=item_image_file;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
