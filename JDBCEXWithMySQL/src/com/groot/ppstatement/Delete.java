package com.groot.ppstatement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;


public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("class loaded");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jec", "root","root");
			System.out.println("Connected");
			Scanner sc=new Scanner(System.in);
			;
			System.out.println("Enter id for update the record  : ");
			int id=sc.nextInt();
			System.out.println("Enter name : ");
			String name=sc.next();
			System.out.println("Enter salary : ");
			int salary=sc.nextInt();
			PreparedStatement ps= conn.prepareStatement("update employee set name=?,salary=?  where id=?");
			ps.setString(1, name);
			ps.setInt(2, salary);
			ps.setInt(3, id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("update");
			}else {
				System.out.println("Not Update");
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
