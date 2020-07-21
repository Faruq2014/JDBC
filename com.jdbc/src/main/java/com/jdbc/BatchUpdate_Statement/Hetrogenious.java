package com.jdbc.BatchUpdate_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hetrogenious {
	static String  url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	static String user="Faruq";
	static String password="1234";
	public static void main(String[] args) {
		// batchUpdate();

	}
	
	private static void batchUpdate() {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			   Connection con=DriverManager.getConnection(url, user, password);
			     Statement stmt=con.createStatement();
			     /*we are doing two different types of operations.
			      * insert
			      * update. 
			      * we are doing it in two different table.  
			      */
			     String sql1="INSERT INTO Students(lastname,firstname) VALUES('Murad','Khan')";
			     stmt.addBatch(sql1);
			     
			     String sql2="update Students set firstname= 'Anjum' where studentId=3";
			      stmt.addBatch(sql2);
			      
			      String sql3="update Course set courseName= 'Java Core'  where courseId=101";
			      stmt.addBatch(sql3);
			     
			      stmt.executeBatch();
			      
			     System.out.println("Batch execution complete");
			     stmt.close();
			     con.close();
			     
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}		
	
	}

     }
