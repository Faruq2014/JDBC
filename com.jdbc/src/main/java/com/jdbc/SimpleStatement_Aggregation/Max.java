package com.jdbc.SimpleStatement_Aggregation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Max {

	public static void main(String[] args) {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // sql server driver code

			String url = "jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;";

			String user = "Faruq";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String select = " select studentId, max(courseFee) as MaximumFee \r\n" + 
					"  from Course\r\n" + 
					"  group by studentId";
			ResultSet rs = stmt.executeQuery(select);
			while (rs.next()) {
				System.out.println("Student ID is: "+rs.getInt("studentId")+" MaximumFee is:  "+rs.getDouble("MaximumFee"));

		}
		con.close();			
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
				
				

	

	}

}
