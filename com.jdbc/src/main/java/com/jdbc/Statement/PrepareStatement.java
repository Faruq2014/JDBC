package com.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatement {
	

public static void main(String[] args) throws SQLException {
	 Connection con=null;
		PreparedStatement preStmt=null;
		ResultSet rs=null;
		// setting connection
		con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;", "Faruq", "1234");
		System.out.println("connected");
		// creating pre statement for query, 
		// with 2 set of parameter. 
		preStmt=con.prepareStatement("select * from Students where lastname =? and studentId=?" );
		// 1st set of parameter is name
		preStmt.setString(1, "Molla");
		// 2nd set of parameter is id
		preStmt.setInt(2, 2);
		// executing the query
		rs=preStmt.executeQuery();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		// printing the result. 
				  while (rs.next()) {
	  		System.out.println(rs.getString("firstname")+rs.getString("phone"));
				  }
            con.close();
            
            
            preStmt.executeUpdate("");
            preStmt.execute("");
            preStmt.executeBatch();
            
		  /*1. we can create one reference preStmt object and create multiple object out of it.
			 * 2. create any types of specific prepareStatement such as update, select, delete and so on.
			 * 3. if you do not know the type than just write execute method.
			 * 4. you can create one prepare statement and run multiple times and it will compile only one 
			 * time. as a result the performance will be good. 
			 * but the problem is you have to write one prepare statement for one query.that means each 
			 * prepare statement is associate with one query and execute it multiple time. you can not 
			 * use same prepare statement for another query. as a result you have to write one prepare 
			 * statement for one query. 
			 * Advantage: 
			 * if you have to execute same query again and again, than it is a good idea to write 
			 * prepare statement. 
			 
			 */
}
}
