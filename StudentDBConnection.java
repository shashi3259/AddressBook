package com.backend;
import java.sql.Connection;
import java.sql.DriverManager;
public class StudentDBConnection {
	static Connection con;
	public static Connection createConnection(){
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create the connection
			String url = "jdbc:mysql://localhost:3306/jdbc_assignment";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
