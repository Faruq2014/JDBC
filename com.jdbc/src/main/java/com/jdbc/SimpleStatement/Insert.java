package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	static String  url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
		public static void main(String[] args) {
		try {
			Connection con= DriverManager.getConnection(url, user, password);
			
			Statement stmt=con.createStatement();
			
			String insert="insert into Students"
			+
			"(lastname,firstname, phone,dob,enrolldate)"
			+
			"values('Khandoker','Anik','7036225008','04/04/2008','03/03/2022')";
			
			stmt.executeUpdate(insert);
			System.out.println("insert complete");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
