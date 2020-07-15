package com.jdbc.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet_Statement_Combination {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

	String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";

					String user="Faruq";
					String password="1234";
	      Connection con= DriverManager.getConnection(url,user,password);	
	      /*Result Set Code
	       * Types_ForwadOnly=1003
	       * Types_Scroll_Sensitve=1004
	       * Types_Scroll_INSensitive=1005
	       * 
	       * Concecred_readOnly=1007
	       * Concered_Update-able=1008
	       * 
	       * we have to be very careful about combination, mis match will throw mismatch exception
	       * there are six combination we can create
	       * Remember: the user permission of the data base is a big deal in the combination.
           * make sure, you have appropriate permission before using the combination. 
	       */
	      
	//Statement stmt1=con.createStatement(1004, 1008);//Scroll-able AND Update-able // any type of operation, Mismatch
	Statement stmt1=con.createStatement(1003, 1008);//Scroll-able AND Update-able // any type of operation
	//Statement stmt2=con.createStatement(1005, 1007);//Scroll-able AND read-able // any type of operation
	  	String select="SELECT * FROM Students";
        ResultSet rs=stmt1.executeQuery(select);
        while (rs.next()) {
    		System.out.println(rs.getString("firstname")+""+rs.getString("lastname"));
			
		}
		con.close();			
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
				

	}

}
