package com.groot.stmt;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("class loaded");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jec", "root","root");
			System.out.println("Connected");
			Statement stmt= conn.createStatement();
			String name="jai";
			int salary=3443;
			int i=stmt.executeUpdate("delete from employee where id=1");
			if(i>0) {
				System.out.println("inserted");
			}else {
				System.out.println("Not inserted");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("After Exception code");
	}
}
