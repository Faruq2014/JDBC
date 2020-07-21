package com.jdbc.preparedStatement_Date_Retrieve;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class MMMM_dd_yyyy {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";  // became constant
		 String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
		 String  user="Faruq";
		 String password="1234";
		
	
		    Connection con=null;
			PreparedStatement preStmt=null;
			ResultSet rs=null;
			
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			preStmt=con.prepareStatement("select dob as string, enrolldate,firstname from Students" );
			rs=preStmt.executeQuery(); 
		
			
			while(rs.next()) {
				/*
				 *2020-02-02  this is sql server default date format. 
				 * we converting this date format to user preferable format.
				 */
				SimpleDateFormat sdf= new SimpleDateFormat("MMMM-dd-yyyy");
				java.sql.Date sqlDob= rs.getDate(1);
				String dob=sdf.format(sqlDob);
				
				
		     	Date  enroll= rs.getDate(2);
		    	String name= rs.getString(3);
			System.out.println("User preferable format>>>  "+dob+"   >>>sql server default format >>>  "+enroll+"   "+name);
			


	}
			con.close();
}

}
