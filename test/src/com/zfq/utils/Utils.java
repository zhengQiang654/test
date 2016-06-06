package com.zfq.utils;


import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Connection;

public class Utils {
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/webblog";
	private String usename = "root";
	private String password = "mengna";
	@Test
	public void getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, usename, password);
			System.out.println("hahha");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
