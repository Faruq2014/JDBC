package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WhereClause {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

	String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";

					String user="Faruq";
					String password="1234";
	      Connection con= DriverManager.getConnection(url,user,password);	
	      Statement stmt=con.createStatement();
	  	String select="\r\n" + 
	  			"Select studentId, firstname, lastname,dbo.CalculateAge(dob) as age from Students where dbo.CalculateAge(dob)>10;";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next()) {
    		System.out.println(rs.getInt("studentId")+" "+rs.getString("firstname")+""+rs.getString("lastname")+""+rs.getString("age"));
    	
		}
		con.close();			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				

	}

}
