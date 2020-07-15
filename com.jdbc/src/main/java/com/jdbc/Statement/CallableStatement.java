		package com.jdbc.Statement;
		
		import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
		
		public class CallableStatement {
		
			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Connection con = null;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				  String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
			      con=DriverManager.getConnection(url, "Faruq", "1234");
				   System.out.println("connected");
				   
				   java.sql.CallableStatement cst=con.prepareCall( "{?=call fnGetStudentFullName(?,?)}" );
				   cst.setString(2, "Faruq");
				   cst.setString(3, "Molla");
				   cst.registerOutParameter(1, Types.VARCHAR);
				   cst.execute();
				   System.out.println(cst.getString(1));
				   
		             con.close();
			}
		/*Also Called PL-SQL
		 * in the data base if group of query pre exist call:
		 * 1. Store Procedure
		 * 2. Function 
		 * Than: we can call them from jdbc class. those are called Call-able Statement ;
		 * only one method is for callable statement is execute(); method. 
		 * Callable statement is the child of prpare statement. As a result it acquire all the methods from father. 
		 * 
		 * Store procedure-->>
		 * 1.store procedure are basically group of query
		 * 2. it can take multiple input parameter and out put parameter.
		 * 3. we must follow some specific rules, what will discuss in store procedure package. 
		 * "{call pro-name(?,?)}"  sql mode 
		 * 
		 * or Pl-sql mode-->
		 * begin
		 * procedure name(?,?) // input and output parameter
		 * end
		 * 
		 *  Function-->>
		 * 1.Function are basically group of query
		 * 2. it can take multiple input parameter but only one output parameter call returns.
		 * 3. Function must have return types 
		 * 3. we must follow some specific rules, what will discuss in Function package. 
		 * "{?=call procedure-name(?)}"  sql mode
		 * 
		 * begin
		 * ?=procedure-name (?,?)
		 * end
		 */
			
			// what is  parameter?
			
			/*There are three types parameter.
			 * in parameter, out parameter, and in out parameter.
			 * 
			 * in parameter-->>
			 * with the help of getter method we will take the input binding with setter method
			 * setInt(1,10)=this is called binding, 1 is the index number of parameter. and 10 is the value. 
			 * 
			 * output parameter--> we must register out put types and with the help of setter method 
			 * we will get the result. 
			 * setOutPutParameterTypes(2 types.INTEGER) = registration binding.
			 * all the data types are java constant data type. INTEGER, CHAR,VARCHAR,DATE,DOUBLE ETC.... 
			 *  with the help of getter method we access the result. cst.getInt(2);
			 * Remember-->> output parameter type and getter method data types must match. 
			 * 
			 * in-out parameter-->>
			 * if one parameter is working both way then it is in out parameter. 
			 * you must perform in binding with setter method.
			 * you must perform out registration binding with out parameter types.
			 * and then get the result with getter method.
			 */
			 
			
			
			//what is execute() method?
			
			/*to execute call-able statement execute method is specially design. This method get the 
			 * call-able statement from the database file and put all the arguments and send the request
			 * to the database. there is already output parameter(?) which is empty place holder. execute 
			 * method get the result from data base and place it in the place holder. 
			 * with the help of getter method we access the result. cst.getInt(2);
			 * Remember-->> output parameter type and getter method data types must match. 
			 */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
