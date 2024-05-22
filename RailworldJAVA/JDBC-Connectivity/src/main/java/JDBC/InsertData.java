package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students?useSSL=false";
			String username = "root";
			String password = "ayushroot@12";
			Connection con =  DriverManager.getConnection(url,username,password);
			
			String query = "create table studentData(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			Statement st = con.createStatement();
			st.executeUpdate(query);
			
			System.out.println("Table created Successfully");
			
			con.close();					
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}
