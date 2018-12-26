package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.sample_site2.dto.LoginDTO;
import com.internousdev.sample_site2.util.DBConnector;
public class LoginDAO {

	public LoginDTO getuserinfo(String userid,String password){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO loginDTO=new LoginDTO();
		String sql="select * from user_info where user_id=? and password=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, password);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				loginDTO.setUserid(rs.getString("user_id"));
				loginDTO.setPassword(rs.getString("password"));
				loginDTO.setUsername(rs.getString("user_name"));
				loginDTO.setAdminstts(rs.getString("admin_stts"));

				if(!(rs.getString("user_id").equals(null))){
					loginDTO.setLoginflg(true);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return loginDTO;
	}

//管理者フラグ用草案
	  public LoginDTO getadmin(String admin_stts){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO logindto=new LoginDTO();
		String sql="select * from user_info where admin_stts=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, admin_stts);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				logindto.setAdminstts(rs.getString("admin_stts"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return logindto;
	}
}
