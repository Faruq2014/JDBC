package com.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test3 {

	public static void main(String[] args) {
	System.out.println("Bismillah");

	try {
		/*
		 * Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); String
		 * username="Fauq"; String password="1234";
		 * System.out.println("command completed successfuly"); String connString
		 * ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+
		 * "databaseName=FaruqAcademy;integratedSecurity=true;";
		 * System.out.println("server connected"); Connection con=
		 * DriverManager.getConnection(connString);
		 * System.out.println("connect completed successfuly"); Statement
		 * stmt=con.createStatement(); String
		 * query="SELECT * FROM [FaruqAcademy].[dbo].[Students] "; ResultSet
		 * rs=stmt.executeQuery(query);
		 */
	
	
	
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;integratedSecurity=true;";
	String username="Faruq";
	String password="1234";
	
	//String connString ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;integratedSecurity=true;";
//Connection con=	DriverManager.getConnection(connString);
	
	Class.forName(driver);
	Connection con	=DriverManager.getConnection(url, username, password);
System.out.println("connect completed successfuly");

	System.out.println();
	} catch (Exception e) {
	e.printStackTrace();	
	}
	
	
	}

}
