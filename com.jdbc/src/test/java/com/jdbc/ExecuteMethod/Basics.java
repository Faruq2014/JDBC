package com.jdbc.ExecuteMethod;

public class Basics {

	public static void main(String[] args) {
// How many execute methods are there?
		/*
		 * There are four execute methods in jdbc.
		 * 1. executeQuery();
		 * executeUpdate();
		 * execute();
		 * executeBatch(); 
		 */
		
		//What is executeQuery();
		
		/*it is use for any type of select query, for simple and prepare statement. such as select * from Students.
		 *the return type of select query is result Set.
		 * ResutSet rs=  st.executeQuery("select*from Students");
		 */
		
		// What is executeUpdate()
		
		/*it is use for any type of non select query. such as update,insert,delete for simple and prepare statement.
		 * String update="update Students"
    		 + "set firstname= 'Faiza'"
    		 +"where id=3";
     
     stmt.executeUpdate(update);.
        /* 
		 *the return type of executeUpdate() is int value.
		 *it is normally tell us how many rows effected. 
		 */
		
		// what is execute() method?
		
		/*if i do not know what kind of query we are getting. such as query coming from
		 * Database, runtime or so on then we can go for execute() method.
		 * it will work for select and non select query. 
		 * The return type of execute() method is boolean. 
		 * boolean b=st.execute("select/non select query")
		 * how do i know is it select query or non select query
		 * if b=true, it is select query. if b=false then it is non select query.
		 * 
		 * if( b=true){
		 * ResultSet rs= st.getResultSet();
		 * } else{
		 * int updateCount= st.getUpdateCount();
		 * 
		 * execute() is also used for callable statement such as store procedure and function.
		 */
		
		// what is executeBatch() method?
		
		/*it is use for batch update.
		 * st.executeBatch();
		 * 
		 * 
		 * 
		 */
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}

