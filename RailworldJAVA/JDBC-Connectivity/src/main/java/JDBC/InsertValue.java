package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertValue {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
			String username = "root";
			String password = "ayushroot@12";
			Connection con =  DriverManager.getConnection(url,username,password);
			
			String query = "insert into studentdata(tName,tCity) values(?,?)";
			
			PreparedStatement ps  = con.prepareStatement(query);
			
			ps.setString(1, "Shivam");
			ps.setString(2, "Ujjan");
			
			ps.executeUpdate();
			
			System.out.println("Data Inserted Successfully");
			
			con.close();					
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}

