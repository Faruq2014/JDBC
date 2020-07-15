package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTution {
	static String  url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
		public static void main(String[] args) {
			
		try {
			Connection con= DriverManager.getConnection(url, user, password);
			
			Statement stmt=con.createStatement();
			
			String insert="insert into Tution"
			+
		"(sessionId,courseId,summerFee, fallFee,winterFee)"
			+
			"values(4,104 ,300,200,100)";
			
			stmt.executeUpdate(insert);
			System.out.println("insert complete");
			
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
