package com.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Full_Join_SearchBy_lastName {
	
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";  // became constant
	 private static final String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	 private static String  user="Faruq";
	 private static String password="1234";
	

	public static void main(String[] args) throws SQLException {
		//final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		 
	 
		
		Connection con=null;
		PreparedStatement preStmt=null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			preStmt=con.prepareStatement("select studentId,sessionId ,firstname,lastname,phone,sessionName, sessionFee from Students full join Session on Students.studentId=Session.sessionId where lastname=?  order by firstname");
			preStmt.setString(1, "Molla");
			rs=preStmt.executeQuery(); 
			while(rs.next()) {
			System.out.println(rs.getInt("studentId")+" "+rs.getString("firstname")+" "+rs.getString("lastname")+" "+rs.getString("sessionName")+""+rs.getString("sessionFee"));	
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
         con.close();
		}
	}

}
