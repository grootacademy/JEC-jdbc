package com.groot.ppstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMultipleRecords {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/jec", "root", "root");
				Scanner sc=new Scanner(System.in);
				while(true) {
					System.out.println("Enter name : ");
					String name=sc.next();
					System.out.println("Enter salary : ");
					int salary=sc.nextInt();
					PreparedStatement ps=conn.prepareStatement("insert into employee (name,salary) value(?,?)");
					ps.setString(1, name);
					ps.setInt(2, salary);
					int i=ps.executeUpdate();
					if(i>0) {
						System.out.println("Record inserted");
					}else {
						System.out.println("not inserted");
					}
					System.out.println("Do you want to insert more y/n ::: ");
					String flag=sc.next();
					if(flag.contains("n")) {
						break;
					}
				}
				System.out.println("After loop");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
