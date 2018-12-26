package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.sample_site2.dto.ProductInfoDTO;
import com.internousdev.sample_site2.util.DBConnector;
public class BuyItemDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private ProductInfoDTO productDTO=new ProductInfoDTO();

	public ProductInfoDTO getproductinfo(){
		String sql="select id,item_name,price,stock,item_image_path,item_image_file from product_info";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				productDTO.setId(rs.getString("id"));
				productDTO.setItemname(rs.getString("item_name"));
				productDTO.setPrice(rs.getString("price"));
				productDTO.setStock(rs.getString("stock"));
				productDTO.setItem_image_path(rs.getString("item_image_path"));
				productDTO.setItem_image_file(rs.getString("item_image_file"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productDTO;
	}
	public ProductInfoDTO getProductInfoDTO(){
		return productDTO;
	}
}
