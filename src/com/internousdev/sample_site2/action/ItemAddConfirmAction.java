package com.internousdev.sample_site2.action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

//画像関係
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ItemAddConfirmAction extends ActionSupport implements SessionAware{
//	ファイル名取得を何とかする
	private String itemname;
	private String itemdecription;
	private String price;
	private String stock;
	private String item_image_path;
	private String item_image_File;
	private String file;
	public Map<String,Object>session;
//	画像用
	private File itemImage;
	private String itemImageContentType;
	private String itemImageFileName;

	public String execute(){
		String result=SUCCESS;
		session.put("itemname", itemname);
		session.put("itemdecription", itemdecription);
		session.put("price", price);
		session.put("stock", stock);
		session.put("item_image_path", item_image_path);
		session.put("item_image_File", item_image_File);

//		取得した画像ファイル名を修正する
		if(!(itemImage == null)) {
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("item_image");
			File fileToCreate = new File(filePath,itemImageFileName);

			try {
				FileUtils.copyFile(itemImage, fileToCreate);
				session.put("item_image_File", item_image_File);
				session.put("item_image_path", "./item_image");
				session.put("image_flg", itemImageFileName);
			}catch(IOException e) {
				e.printStackTrace();
			}
//			画像ファイルをDBへ送る
			filePath = ServletActionContext.getServletContext().getRealPath("/").concat("item_image/");

			fileToCreate = new File(filePath,itemImageFileName);
			try {
				FileUtils.copyFile(itemImage, fileToCreate);
				session.put("itemImageFileName", itemImageFileName);
				session.put("imageFilePath", "./item_image/");
				session.put("image_flg", itemImageFileName);
				item_image_File=itemImageFileName;
				item_image_path="./item_image";
			}catch(IOException e) {
				e.printStackTrace();
			}
		}



		return result;
	}
	public String getItemname(){
		return itemname;
	}
	public void setItemname(String itemname){
		this.itemname=itemname;
	}
	public String getItemdecription(){
		return itemdecription;
	}
	public void setItemdecription(String itemdecription){
		this.itemdecription=itemdecription;
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
	public String getItem_image_File(){
		return item_image_File;
	}
	public void setiIem_image_File(String item_image_File){
		this.item_image_File=item_image_File;
	}
	public String getFile(){
		return file;
	}
	public void setFile(String file){
		this.file=file;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public File getItemImage() {
		return itemImage;
	}
	public void setItemImage(File itemImage) {
		this.itemImage=itemImage;
	}
	public String getItemImageContentType() {
		return itemImageContentType;
	}
	public void setItemImageContentType(String itemImageContentType) {
		this.itemImageContentType=itemImageContentType;
	}
	public String getItemImageFileName() {
		return itemImageFileName;
	}
	public void setItemImageFileName(String itemImageFileName) {
		this.itemImageFileName=itemImageFileName;
	}

}
