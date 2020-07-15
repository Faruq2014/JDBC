package com.jdbc.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSet_PreparedStatement_Combination {

	public static void main(String[] args) throws SQLException {
    Connection con=null;
	PreparedStatement preStmt=null;
	ResultSet rs=null;
	try {
		// setting connection
	con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
	System.out.println("connected");
	
	String query1="select * from Students where lastname =? and studentId=?";
	
	   /*Result Set Code
     * Types_ForwadOnly=1003
     * Types_Scroll_Sensitve=1004
     * Types_Scroll_INSensitive=1005
     * 
     * Concecred_readOnly=1007
     * Concered_Update-able=1008
     * 
     * we have to be very careful about combination, mis match will throw mismatch exception
     * there are six combination we can create. 
     * 
     * Remember: the user permission of the data base is a big deal in the combination.
     * make sure, you have appropriate permission before using the combination.
     */
    
	
	preStmt=con.prepareStatement(query1,1003, 1008 );
	
	preStmt.setString(1, "Molla");
	
	preStmt.setInt(2, 2);

	rs=preStmt.executeQuery();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
	
	  while (rs.next()) {
  		System.out.println(rs.getString("firstname")+rs.getString("phone"));
		
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
        con.close();
	}

}
