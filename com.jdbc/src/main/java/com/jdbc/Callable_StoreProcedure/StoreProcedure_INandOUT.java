package com.jdbc.Callable_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoreProcedure_INandOUT {

	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub
Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
System.out.println("Connected");
CallableStatement cst=con.prepareCall("{call spCreateFullName(?,?,?)}");

cst.setInt(1, 7);


   cst.registerOutParameter(2, Types.NVARCHAR);
   cst.registerOutParameter(3, Types.NVARCHAR);
 cst.execute();
 System.out.println(cst.getString(2));
 System.out.println(cst.getString(3));
	
	
	  //ResultSet rs= cst.getResultSet();
	  
	  
		/*
		 * while(rs.next()) { String Fulname=rs.getString(2)+rs.getString(1);
		 * System.out.println(Fulname);
		 * 
		 * System.out.println(rs.getString(2)); System.out.println(rs.getString(1));
		 * 
		 * }
		 * 
		 */
	 
	  con.close();


	}

}
