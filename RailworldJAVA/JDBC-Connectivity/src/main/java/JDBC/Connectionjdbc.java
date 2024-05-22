package JDBC;

import java.sql.*;
import java.sql.DriverManager;

public class Connectionjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "ayushroot@12";
			Connection con =  DriverManager.getConnection(url,username,password);
			if(con.isClosed()) {
				System.out.println("Connection Closed");
			}else {
				System.out.println("Connection Created");
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

