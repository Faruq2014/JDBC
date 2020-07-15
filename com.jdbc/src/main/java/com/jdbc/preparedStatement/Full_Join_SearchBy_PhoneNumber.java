	package com.jdbc.preparedStatement;
	
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	
	public class Full_Join_SearchBy_PhoneNumber {
	
		public static void main(String[] args) {
   String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	String user="Faruq";
	String password="1234";
	Connection con=null;
	PreparedStatement prestmt=null;
	ResultSet rs=null;
	
	try {
		Class.forName(driver); // i am not sure why this line is optional.
		con=DriverManager.getConnection(url, user, password);
		System.out.println("Connected");
		prestmt=con.prepareStatement("select Students.studentId,courseId,firstname,lastname,phone,courseName,courseFee from Students full join Course on Students.studentId=Course.studentId where phone=?");
		prestmt.setString(1, "7032869883");
		rs=prestmt.executeQuery();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		// printing the result. 
		  while (rs.next()) {
	  		System.out.println(rs.getString("firstname")+" "+rs.getString("lastname")+" "+rs.getString("phone"));
	  		System.out.println(rs.getInt("studentId")+" "+rs.getString("courseId")+" "+rs.getString("courseName")+" "+rs.getString("courseFee"));
	  		System.out.println("<<<<>>>>>>");
	  
			}
	
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		}
		
	}