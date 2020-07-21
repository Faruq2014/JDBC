package com.jdbc.preparedStatement_Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class SDF_Convert_StringTo_Date_Format {

	public static void main(String[] args) {
/* two ways we can insert date into database, simple and prepared statement,
 * to insert date into data base: prepare statement is highly recommended
 * the way of representing  date into data base is different between database to database.
 * oracle default style is dd-MMM-yy=12-jan-80
 * sql server default style is yyyy-MM-dd=1980-01-12
 */
	    Connection con=null;
		PreparedStatement preStmt=null;
	
		try {
	
		con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
		System.out.println("connected");
	      System.out.println("inserting new entry into the data base.");
		preStmt=con.prepareStatement("insert into Students (lastname,firstname,dob) values ( ?,?,?)");
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter your last name");
		String lastname=sc1.next();
		preStmt.setString(1, lastname);
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname=sc2.next();
		preStmt.setString(2, firstname);
		
		
		Scanner sc3= new Scanner(System.in);
		System.out.println("Enter your DOB yyyy-MM-dd");
		String dob=sc3.next();

		//converting String to date format
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date Udate=sdf.parse(dob);
		Long l=Udate.getTime();
		java.sql.Date Sdate1=new java.sql.Date(l);
		preStmt.setDate(3,  Sdate1);

			preStmt.executeUpdate();
		
		System.out.println("executed");
		

		} 
		  catch (SQLException | ParseException e) {
			
			e.printStackTrace();
		}
	        finally {
				try {
					preStmt.closeOnCompletion();
					con.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			} 

	}

}
