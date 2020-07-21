package com.jdbc.preparedStatement_Date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Default_Date {

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
			while(rs.next()) {
				String fulnmae= rs.getString(3)+rs.getString(2);
				java.sql.Date dob= rs.getDate(5);
				Date enroll= rs.getDate(6);
			System.out.println( fulnmae+dob+"  "+enroll);
			con.close();

	}

}
}