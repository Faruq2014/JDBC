package com.jdbc.SimpleStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
			String user="Faruq";
			String password="1234";
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			String delete="delete from Students where id=3";
			int rowsAffacted=stmt.executeUpdate(delete);
			System.out.println("rows affacted "+rowsAffacted);
			System.out.println("Deletion completed");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
