package com.jdbc.SimpleStatement_Count;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Count {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

			String url = "jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";

			String user = "Faruq";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String select = "SELECT COUNT(*)\r\n" + 
					"	  FROM    [FaruqAcademy].[dbo].[SSISBTteam]\r\n" + 
					"	  AS Total_Players";
			
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {
				System.out.println("Total count is>>>   "+ rs.getInt(1));

		}
		con.close();			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				

	}

}
