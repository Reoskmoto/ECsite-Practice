package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.sample_site2.util.DBConnector;
import com.internousdev.sample_site2.util.DateUtil;

public class BuyItemCompleteDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil date=new DateUtil();
	private String sql="insert into purchase_history_info(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) values(?,?,?,?,?,?)";

	public void buyitem(String item_transaction_id,String total_price,String total_count,String user_master_id,String pay)
	throws SQLException{

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, date.getDate());
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
