	package com.jdbc.Callable_StoreProcedure;
	
	import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	
	public class StoreProcedure_Multipole_IN {
	
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
	Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
	System.out.println("Connected");
	CallableStatement cst=con.prepareCall("{call spMultipoleIN(?,?)}");
	cst.setString(1, "Faruq");
	cst.setString(2, "Molla");

     cst.execute();
  
	
     
   ResultSet rs=  cst.getResultSet();
   while(rs.next()) {
	   System.out.println(rs.getInt("studentId")+" "+rs.getString("firstname")+""+rs.getString("lastname")); 
	   System.out.println(rs.getInt("sessionId")+" "+rs.getString("sessionName")+""+rs.getString("sessionFee"));

   }
   con.close();
	}
}