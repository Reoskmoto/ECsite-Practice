package com.internousdev.sample_site2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dto.UserInfoDTO;
import com.internousdev.sample_site2.util.DBConnector;
public class UserListDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private List<UserInfoDTO> userlistdto=new ArrayList<UserInfoDTO>();

	public List<UserInfoDTO>getuserlist()throws SQLException{
		String sql="select * from user_info";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				UserInfoDTO userdto=new UserInfoDTO();
				userdto.setId(rs.getString("id"));
				userdto.setUserid(rs.getString("user_id"));
				userdto.setPassword(rs.getString("password"));
				userdto.setUsername(rs.getString("user_name"));
				userdto.setMail(rs.getString("mail"));
				userdto.setInsert_date(rs.getString("insert_date"));
				userlistdto.add(userdto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userlistdto;
	}

}