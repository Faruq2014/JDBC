package com.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Insert {

	public static void main(String[] args) {

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
