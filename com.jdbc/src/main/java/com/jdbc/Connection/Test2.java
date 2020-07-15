package com.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//System.out.println("command completed successfuly");
		
		
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://localhost:1433/FaruqAcademy";
		String url1="jdbc:sqlserver://localhost:3306/FaruqAcademy";
		String username="Faruq";
		String password="1234";
		
		//String connString ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;integratedSecurity=true;";
	//Connection con=	DriverManager.getConnection(connString);
		
		Class.forName(driver);
		Connection con	=DriverManager.getConnection(url1, username, password);
	System.out.println("connect completed successfuly");
	

	}

}
