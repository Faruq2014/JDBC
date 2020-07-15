package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoSession {
	static String  url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
		public static void main(String[] args) {
		try {
			Connection con= DriverManager.getConnection(url, user, password);
			
			Statement stmt=con.createStatement();
			
			String insert="insert into Session"
			+
			"(sessionId,sessionName, courseId,sessionFee)"
			+
			"values(6 ,'Winter',102,'400')";
			
			
			stmt.executeUpdate(insert);
			System.out.println("insert complete");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
