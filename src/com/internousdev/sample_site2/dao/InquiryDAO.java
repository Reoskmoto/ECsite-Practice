package com.internousdev.sample_site2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample_site2.dto.InquiryDTO;
import com.internousdev.sample_site2.util.DBConnector;
import com.internousdev.sample_site2.util.DateUtil;
public class InquiryDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil date=new DateUtil();
	List<InquiryDTO>inquirylist=new ArrayList<InquiryDTO>();

	public List<InquiryDTO> select()throws SQLException{
		String sql="select * from inquiry";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				InquiryDTO dto=new InquiryDTO();
				dto.setName("name");
				dto.setMail("mail");
				dto.setQtype("qtype");
				dto.setBody("body");
				inquirylist.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return inquirylist;
	}
//DBへ追加
	public int insert(String name,String mail,String qtype,String body)throws SQLException{
		int ret=0;
		String sql="insert into inquiry(name,mail,qtype,body,insert_date)values(?,?,?,?,?)";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, mail);
			ps.setString(3, qtype);
			ps.setString(4, body);
			ps.setString(5, date.getDate());
			int i=ps.executeUpdate();

			if(i>0){
				System.out.println(i+"件登録されました");
				ret=i;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return ret;
	}
//リスト表示
	public List<InquiryDTO> getinquirylist()throws SQLException{
		String sql="select * from inquiry";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				InquiryDTO list=new InquiryDTO();
				list.setName(rs.getString("name"));
				list.setMail(rs.getString("mail"));
				list.setQtype(rs.getString("qtype"));
				list.setBody(rs.getString("body"));
				list.setInsert_date(rs.getString("insert_date"));
				inquirylist.add(list);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return inquirylist;
	}
//削除
	public int inquirydelete(){
		String sql="delete from inquiry";
		int result=0;
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			result=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}
}
