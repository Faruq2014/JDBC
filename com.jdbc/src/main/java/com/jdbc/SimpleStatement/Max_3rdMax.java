package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Max_3rdMax {
	static String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
	public static void main(String[] args) {
		maxSalary();
		SecondHighestSalaryWith_LessThan();
		ThirdHighestSalary();
	}
	
	public static void  maxSalary() {
		try {
	
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		String maxSalary="\r\n" + 
				"SELECT MAX(summerFee) From Tution as maximum;";
		ResultSet rs=stmt.executeQuery(maxSalary);
		while(rs.next()) {
			System.out.println("The Maximaum summer tution fee is "+rs.getInt(1));
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public static void  SecondHighestSalaryWith_LessThan() {
		try {
			
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		String SndHighSalary="SELECT MAX(summerFee) From Tution   WHERE summerFee< ( SELECT Max(summerFee) FROM Tution )";
		ResultSet rs=stmt.executeQuery(SndHighSalary);
		while(rs.next()) {
			System.out.println("The second highest maximum summer tution fee is "+rs.getInt(1));
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public static void  ThirdHighestSalary() {
		try {
			
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		String SndHighSalary="SELECT  MAX(summerFee)\r\n" + 
				"FROM    Tution WHERE summerFee < (\r\n" + 
				"                        SELECT  MAX(summerFee)\r\n" + 
				"                        FROM    Tution WHERE summerFee < (\r\n" + 
				"                                                SELECT  MAX(summerFee)\r\n" + 
				"                                                FROM    Tution)\r\n" + 
				"                                )";
		ResultSet rs=stmt.executeQuery(SndHighSalary);
		while(rs.next()) {
			System.out.println("The third highest maximum summer tution fee is "+rs.getInt(1));
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
