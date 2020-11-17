package com.jdbc.RowSet;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Select {
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//static final String JDBC_DRIVER = "net.sourceforge.jtds.jdbc.Driver";
	
		   static final String DB_URL =
				   "jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
		   static final String DB_USER = "Faruq";
		   static final String DB_PASS = "1234";
		  static JdbcRowSet rowSet = null;
		   
	public static void main(String[] args) {
		

		 try {
			 
			 RowSetFactory rs = RowSetProvider.newFactory();
			 JdbcRowSet rowSet=rs.createJdbcRowSet();
	         Class.forName(JDBC_DRIVER);
	     //  rowSet = new JdbcRowSetImpl();
	    
	         rowSet.setUrl(DB_URL);
	         rowSet.setUsername(DB_USER);
	         rowSet.setPassword(DB_PASS);
	         System.out.println("connected");
	         
	     	
	        
	         rowSet.setCommand("SELECT * FROM Person Students");
	         rowSet.execute();
	         rowSet.afterLast();
	       
	        

	       
	     	while (rowSet.previous()) {
	     		System.out.println(rowSet.getInt(1)+""+rowSet.getString(2));
	     		
	     	}
	      }
	      catch (SQLException | ClassNotFoundException ex) {
	         ex.printStackTrace();
	      }
		 finally {
			 if (rowSet !=null) {
				 try {
					rowSet.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
		 }

	
	}

}
