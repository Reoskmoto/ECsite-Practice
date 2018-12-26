package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.sample_site2.util.DBConnector;
import com.internousdev.sample_site2.util.DateUtil;
public class UserCreateCompleteDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil date=new DateUtil();
	private String sql="insert into user_info(user_id,password,user_name,mail,insert_date) values(?,?,?,?,?)";

	public void createuser(String userid,String password,String username,String mail)throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, password);
			ps.setString(3, username);
			ps.setString(4, mail);
			ps.setString(5, date.getDate());
			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
