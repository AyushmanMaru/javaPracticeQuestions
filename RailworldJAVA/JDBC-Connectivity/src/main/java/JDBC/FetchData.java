package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class FetchData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students?allowPublicKeyRetrieval=true&useSSL=false";
			String username = "root";
			String password = "ayushroot@12";
			Connection con =  DriverManager.getConnection(url,username,password);
			
			String query = "select * from studentdata";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next()) {
				int Sid = rs.getInt(1);
				
				String name = rs.getString(2);
				String city = rs.getString(3);
				
				System.out.println(Sid);
				System.out.println(name);
				System.out.println(city);
			}
			
			
			System.out.println("Data Fetched Successfully");
			
			con.close();					
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}


