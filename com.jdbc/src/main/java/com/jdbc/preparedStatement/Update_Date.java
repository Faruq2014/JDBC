package com.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Update_Date {

	public static void main(String[] args) {

	    Connection con=null;
		PreparedStatement preStmt=null;
	
		try {
	
		con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
		System.out.println("connected");
	
		preStmt=con.prepareStatement("update Students set dob= ? where studentId=?");
		
		String dob1="1982-11-20";
		//converting String to date format
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date Udate=sdf.parse(dob1);
		Long l=Udate.getTime();
		java.sql.Date Sdate1=new java.sql.Date(l);
		
		preStmt.setDate(1,  Sdate1);
		preStmt.setInt(2, 1);
		preStmt.addBatch();
		
		String dob2="2010-12-20";
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date Udate2=sdf2.parse(dob2);
		Long l2=Udate2.getTime();
		java.sql.Date Sdate2=new java.sql.Date(l2);
		
		preStmt.setDate(1, Sdate2);
		preStmt.setInt(2, 2);
		preStmt.addBatch();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		preStmt.executeBatch();
		
		System.out.println("executed");
		} catch (SQLException | ParseException e) {
			
			e.printStackTrace();
		}
	        finally {
				try {
					con.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			} 

	}

}
