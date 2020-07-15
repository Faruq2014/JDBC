package com.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

		String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";

						String user="Faruq";
						String password="1234";
		      Connection con= DriverManager.getConnection(url,user,password);	
		      Statement stmt=con.createStatement();
		         stmt.executeUpdate("update");
				 stmt.executeUpdate("delete");
				 stmt.executeQuery("anything");
				 stmt.execute("name of the query");
				 
		  	String select="SELECT * FROM Students";
	        ResultSet rs=stmt.executeQuery(select);
	        while (rs.next()) {
	    		System.out.println(rs.getString("firstname")+""+rs.getString("lastname"));
				
			}
			con.close();	
	}
	/*1. we can create one reference stmt object and create multiple object out of it.
	 * 2. create any types of specific query such as update, select, delete and so on.
	 * 3. if you do not know the type than just write execute method. 
	 * but problem is, if write a query and execute same query again and again then it is not 
	 * the good idea to write simple statement. because the query compile every time we
	 * run. as a result if run 1000 times it will compile 1000 times. so performance will
	 * be down. 
	 */
}
