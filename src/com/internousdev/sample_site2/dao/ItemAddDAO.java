package com.internousdev.sample_site2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//ファイルアップに必要？
/*import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;*/

import com.internousdev.sample_site2.util.DBConnector;
import com.internousdev.sample_site2.util.DateUtil;
public class ItemAddDAO {

	private DateUtil date=new DateUtil();
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private String sql="insert into product_info (item_name,item_description,price,stock,item_image_path,item_image_file,insert_date) values(?,?,?,?,?,?,?)";

	public void itemadd(String item_name,String item_description,String price,String stock,
			String item_image_path,String item_image_file)throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_name);
			ps.setString(2, item_description);
			ps.setString(3, price);
			ps.setString(4, stock);
			ps.setString(5, item_image_path);
			ps.setString(6, item_image_file);
			ps.setString(7, date.getDate());

			ps.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
