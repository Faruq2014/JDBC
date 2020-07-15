package com.jdbc.Callable_Function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Function_multipoleIN_OUT {

	public static void main(String[] args) {
		Connection con = null;
     try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	 con=DriverManager.getConnection(url, "Faruq", "1234");
		   System.out.println("connected");
		   
		   CallableStatement cst=con.prepareCall( "{?=call fnGetStudentFullName(?,?)}" );
		   cst.setString(2, "Faruq");
		   cst.setString(3, "Molla");
		   cst.registerOutParameter(1, Types.VARCHAR);
		   cst.execute();
		   System.out.println(cst.getString(1));
		   
		   
		   
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}finally{
		
		try {
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
   
   
  



	}
	}





