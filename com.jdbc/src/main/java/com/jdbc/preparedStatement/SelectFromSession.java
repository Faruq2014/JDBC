package com.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectFromSession {

	public static void main(String[] args) throws SQLException {
    Connection con=null;
	PreparedStatement preStmt=null;
	ResultSet rs=null;
	try {
		// setting connection
	con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
	System.out.println("connected");
	// creating pre statement for query, 
	// with 2 set of parameter. 
	preStmt=con.prepareStatement("select * from Session where sessionId =? and courseId=?" );
	// 1st set of parameter is name
	preStmt.setInt(1, 5);
	// 2nd set of parameter is id
	preStmt.setInt(2, 102);            //make sure the combination of sessionId and courseId exists. 
	// executing the query
	rs=preStmt.executeQuery();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	// printing the result. 
	  while (rs.next()) {
  		System.out.println("Session "+ rs.getString("sessionName")+"session Fee "+rs.getString("sessionFee"));
		
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
        con.close();
	}

}
