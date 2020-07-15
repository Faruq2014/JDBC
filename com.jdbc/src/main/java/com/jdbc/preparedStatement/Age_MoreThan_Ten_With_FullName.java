	package com.jdbc.preparedStatement;
				
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
				
	public class Age_MoreThan_Ten_With_FullName {
	
		public static void main(String[] args) throws SQLException {
	    Connection con=null;
		PreparedStatement preStmt=null;
		ResultSet rs=null;
		try {
		
		con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
		
		System.out.println("connected");
		
		preStmt=con.prepareStatement("select studentId,[dbo].[fnGetStudentFullName](firstname, lastname)as fullnmae, [dbo].[CalculateAge](dob)as age from Students where [dbo].[CalculateAge](dob)>6" );
		
		rs=preStmt.executeQuery();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		
		  while (rs.next()) {
	  		System.out.println(rs.getInt("studentId")+"  "+rs.getString("fullnmae")+rs.getString("age"));
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	        con.close();
		}
	
	}
