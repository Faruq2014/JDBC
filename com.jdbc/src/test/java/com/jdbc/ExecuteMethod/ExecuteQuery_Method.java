package com.jdbc.ExecuteMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery_Method {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

	String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";

					String user="Faruq";
					String password="1234";
	      Connection con= DriverManager.getConnection(url,user,password);	
	      Statement stmt=con.createStatement();
	  	String select="SELECT * FROM Students";
        ResultSet rs=stmt.executeQuery(select);
        while (rs.next()) {
    		System.out.println(rs.getString("firstname")+""+rs.getString("lastname"));
			
		}
		con.close();			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				

	}

}
