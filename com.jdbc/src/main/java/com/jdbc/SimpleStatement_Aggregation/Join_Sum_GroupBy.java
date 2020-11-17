package com.jdbc.SimpleStatement_Aggregation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Join_Sum_GroupBy {

	public static void main(String[] args) {


		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

			String url = "jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";

			String user = "Faruq";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String query1 =" select  sum(courseFee) as total from Students full outer join Course on Students.studentId=Course.studentId group by Students.studentId;";
			String query2 = "select sum(courseFee) as total from Students full outer join Course on Students.studentId=Course.courseId group by Course.courseId";
			ResultSet rs = stmt.executeQuery(query2);
			while (rs.next()) {
				System.out.println(" Total due is:  "+rs.getDouble("total"));

		}
		con.close();			
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
				
				

	

	

	}

}
