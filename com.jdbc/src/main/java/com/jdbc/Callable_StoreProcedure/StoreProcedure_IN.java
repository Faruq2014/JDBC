package com.jdbc.Callable_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreProcedure_IN {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection(
				"jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;" + "databaseName=FaruqAcademy;", "Faruq", "1234");
		System.out.println("Connected");
		CallableStatement cst = con.prepareCall("{call sp2ByLastnameFromStudents(?)}");
		cst.setString(1, "Molla");
		cst.execute();
		//System.out.println(cst.getString(1));

		
		  ResultSet rs= cst.getResultSet();
		  while(rs.next()) { System.out.println(
		  "     Id>>>      " + rs.getInt("studentId") + "   firstname>> " +
		  rs.getString("firstname") + "   lastname>>  " + rs.getString("lastname") +
		  "   phone >>    " + rs.getString("phone") + "   dob >>    " +
		  rs.getString("dob")
		  
		  
		  );
		  
		  
		  }
		 con.close();
	}
}