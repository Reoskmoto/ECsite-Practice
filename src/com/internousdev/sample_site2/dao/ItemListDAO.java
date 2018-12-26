package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dto.ProductInfoDTO;
import com.internousdev.sample_site2.util.DBConnector;
public class ItemListDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private List<ProductInfoDTO>itemlistDTO=new ArrayList<ProductInfoDTO>();

//	商品リスト取得
	public List<ProductInfoDTO>getitemlist()throws SQLException{
		String sql="select * from product_info order by id";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				ProductInfoDTO productDTO=new ProductInfoDTO();
				productDTO.setId(rs.getString("id"));
				productDTO.setItemname(rs.getString("item_name"));
				productDTO.setItemdescription(rs.getString("item_description"));
				productDTO.setPrice(rs.getString("price"));
				productDTO.setStock(rs.getString("stock"));
				productDTO.setInsert_date(rs.getString("insert_date"));
				itemlistDTO.add(productDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return itemlistDTO;
	}

//	商品削除用
	public int itemdelete()throws SQLException{
		String sql="delete from product_info";
		int result=0;
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			result=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
