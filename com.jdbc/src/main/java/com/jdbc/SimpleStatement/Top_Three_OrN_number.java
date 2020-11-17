package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Top_Three_OrN_number {

	
	static String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
	public static void main(String[] args) {
		topMethod();
		topMethod_WithoutDistinct();

	}
	
	public static  void topMethod() {
		try {
			Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=	con.createStatement();
		String top4="SELECT DISTINCT TOP 4 summerFee,courseId \r\n" + 
				"FROM Tution \r\n" + 
				"ORDER BY summerFee DESC";
		ResultSet rs=stmt.executeQuery(top4);
		System.out.println("Top 4 highest to lowest >>>because of Distinct ");
		while(rs.next()) {
		
		System.out.println("Summer fee "+rs.getInt(1)+" course ID "+ rs.getString("courseId"));	
		}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public static  void topMethod_WithoutDistinct() {
		try {
			Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=	con.createStatement();
		String top4="SELECT * FROM Tution WHERE summerFee in(SELECT TOp 4 summerFee from Tution  ORDER BY summerFee desc)";
		ResultSet rs=stmt.executeQuery(top4);
		System.out.println("Top 4 but not in highest to lowest, >>>>>>>>");
		while(rs.next()) {
			
		System.out.println("Summer fee "+rs.getInt("summerFee")+" course ID "+ rs.getString("courseId"));	
		}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
