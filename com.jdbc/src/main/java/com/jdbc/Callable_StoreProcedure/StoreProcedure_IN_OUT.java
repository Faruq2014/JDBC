	package com.jdbc.Callable_StoreProcedure;
	
	import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
	
	public class StoreProcedure_IN_OUT {
	
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
	Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
	System.out.println("Connected");
	CallableStatement cst=con.prepareCall("{call spGetStudentsInfoByLastname2(?,?)}");
	cst.setString(1, "molla");

	   cst.registerOutParameter(2, Types.NVARCHAR);
     cst.execute();
     System.out.println(cst.getString(2));
	
	 
		  con.close();
	}
}