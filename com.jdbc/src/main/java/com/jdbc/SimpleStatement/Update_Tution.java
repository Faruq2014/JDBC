package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Tution {
	static String  url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
      Connection con=DriverManager.getConnection(url, user, password);
     Statement stmt=con.createStatement();
     String update="update Tution set summerFee=600 where sessionId=1";
     
     stmt.executeUpdate(update);
     System.out.println("update complete");
     con.close();
	}

}
