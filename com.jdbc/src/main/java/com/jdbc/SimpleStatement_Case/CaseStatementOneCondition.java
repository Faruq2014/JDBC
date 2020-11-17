package com.jdbc.SimpleStatement_Case;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Faruq
 * 
 * How to create case statement
first select statment(column name)
then case statement
when id=1 then ' ' for integer
when [Diffender] is not null then ' ' (for string)
else condition.

==================================================
it is basically if>>>then>>>>else  condition
==================================================

 *
 */
public class CaseStatementOneCondition {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

			String url = "jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";

			String user = "Faruq";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String select = " SELECT[name ],[id ],\r\n" + 
					"CASE\r\n" + 
					"  WHEN [Diffender] is not null THEN 'diffender'\r\n" + 
					"  WHEN [Striker]  is not null THEN 'striker'\r\n" + 
					"  ELSE 'midfielder'\r\n" + 
					"END as Position\r\n" + 
					"FROM [FaruqAcademy].[dbo].[SSISBTteam] order by [name ]\r\n" + 
					"";
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {
				System.out.println("name>>>  "+rs.getString(1) + " ID>>  " + rs.getInt(2)+"  Position>>  "+rs.getString(3));

		}
		con.close();			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				

	}

}
