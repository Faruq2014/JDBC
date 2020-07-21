package com.jdbc.preparedStatement_Date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class SDF_Convert_DateTo_String_Format {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
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
			preStmt=con.prepareStatement("select * from Students where lastname=?" );
			preStmt.setString(1, "Molla");
			rs=preStmt.executeQuery(); 
			SimpleDateFormat sdf= new SimpleDateFormat ("MM-dd-yyyy");//MM must be uppercase
			/*you can create any combination of date format such as 
			 * MM-dd-yyyy
			 * dd-MM-yyyy
			 * yyyy-dd-MM
			 * yy-MM-dd
			 * 
			 */
			while(rs.next()) {
				String fulnmae= rs.getString(3)+rs.getString(2);
				java.sql.Date dob= rs.getDate(5);
				String Sdob=sdf.format(dob);
				Date enroll= rs.getDate(6);
			System.out.println( fulnmae+Sdob+"  "+enroll);	

	}

}
}