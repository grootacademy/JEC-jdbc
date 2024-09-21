package com.groot.ppstatement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;


public class ReadData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("class loaded");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jec", "root","root");
			System.out.println("Connected");
			PreparedStatement ps= conn.prepareStatement("select * from employee");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt("salary"));
			}
//			Statement stmt= conn.createStatement();
//			String name="jai";
//			int salary=3443;
//			int i=stmt.executeUpdate("insert into employee (name,salary) values('ram',2323,)");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("After Exception code");
	}
}
