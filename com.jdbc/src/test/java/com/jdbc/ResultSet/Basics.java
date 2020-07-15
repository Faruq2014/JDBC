package com.jdbc.ResultSet;

public class Basics {

	public static void main(String[] args) {

	// What is Result Set?
		
		/*Result set is an interface of jdbc API. Implementation classes are provided by vendors
		 * such as my sql, sql server and so on. 
		 * 
		 */
		
	// Why do we need result set?
		
		/*it is used to store the result collected from data base.
		 * it is only work with select query. 
		 */
		// how result set works?
		
		/*java application create query request--> driver pickup the request--> send it to the data base.
		 * Data base compile and execute the query--send the response to the driver.
		 * driver create an object based on condition in the select query by implementing the result set classes.
		 * sent the organized result set to the java application.
		 * java application create a local variable called  ResultSet rs= st.executeQuery("select *");
		 * the result is form of SET.
		 */
		
		// where is result set applicable?
		
		/*executeQuery()=return set of result. so we can implements result set interface.
		 * 
		 * executeUpdate()=return %ROW_COUNT. it brings int values. so we can not use result set.
		 * 
		 * execute()=return boolean.%FOUND. indirectly we can use it. we can say,  
		 *  if b=true, it is select query. if b=false then it is non select query.
		 * 
		 * if( b=true){
		 * ResultSet rs= st.getResultSet();
		 * } else{
		 * int updateCount= st.getUpdateCount();
		 * 
		 */
		
		// How cursor works in the result set?
		
		/*ZRA=Zero Record Area or BFR=Before Record Area=beginning of the table.
		 * NRA=No Record Area or ALR= After Last Record= end of the table.
		 * driver create an object with a table form. and by default cursor is present in the 
		 * ZRA. we need to move the cursor to the record area where our intended result is present.
		 * 
		 * 
		 */
		//How many methods are in the result set?
		
		/* to move the cursor there are 8 plus navigational methods are available . but most popular one is 
		 * next();
		 * 
		 * to read the data  or retrieve the data from result set most popular method is 
		 * get().
		 * 
		 * Remember: we must position the cursor in the desired location. because by default 
		 * the getter method get the result from current location. 
		 * 
		 */
		
		
		// explain next() method?
		
		/* ResultSet interface provide 8 plus navigational method to move cursor.
		 * public boolean next();
		 * public boolean last();
		 * public boolean first();
		 * public boolean beforeLast();
		 * public boolean beforeFirst();
		 * public boolean afterLast();
		 * public boolean afterFirst();
		 * public boolean absolute();
		 * 
		 * rs.next();
		 * so if moving the cursor is successful and data is present than it will return true
		 * if both condition is not met then it will return false and throw sql exception. 
		 * 
		 */
		
		// explain while loop in the result set.
		
		/*while loop is java core concept. when we have more than one set of record, instead of 
		 * manually moving the cursor we use while loop. 
		 * while (rs.next()) {
    		System.out.println(rs.getString("firstname")+""+rs.getString("lastname"));
			
		}
		 */
		
		// what is getter method?
		
		/*To retrieve the data from the record we use getter method. there are 26+ overloaded getter 
		 * method available. Remember get method always retrieve the current position data,CCLR
		 * =Currently Cursor Location Record. so
		 * moving the cursor is very important.
		 * you can retrieve the date via column index .(in data base index start from 1.) or you 
		 * also can retrieve data via column name.
		 * 
		 * 
		 *  public getString(column ID);   public getString(column name); 
		 *  public getInt(column ID);      public getIt(column name); 
		 *  public getDouble(column ID);   public getDouble(column name); 
		 *  public getDate(column ID);     public getDate(column name); 
		 *  public getMoney(column ID);    public getMoney(column name);  so on....
		 * 
		 * Remember public getString(column ID)=must be exact data type and index in the column of resultSET.
		 *  if this does not match, you will get sql exception. 
		 * 
		 * Remember public public getString(column name)=must be exact data type and name in the column of resultSET. if this 
		 * does not match, you will get sql exception. 
		 */
		
		// what if I do not know the data type of the column?
		/*
		 * use public getString(column ID); or public getString(column name); 
		 * get the data in string format no matter what the data type is. 
		 * but it is not recommended. 
		 */
		
		// what is default resultSet?
		
		/*
		 * by default ResultSet interface create object F-M(Forward Moving) and R-O(Read Only).
		 * so it is not possible go backward or get randomly. 
		 * it is also not possible update, delete or insert operation. 
		 * if you need do any of the above operation, there is special result set available. 
		 * As a result in this default ResultSet interface we only able to use next() method.
		 * As a result in this default ResultSet interface we only able to use select query.
		 */
		
		//What is the difference between ResultSet table and actual table ?
		
		/*ResultSet interface create object table based on the select query condition from the actual table.
		 * and store on the context area. we access the data with the help of cursor and getter method.
		 * if we run clear() manually or con.close, this table will be destroyed by garbage collection.
		 * but actual table will be there. 
		 * As  A Result---->>
		 * your get method index number or column name should be based on your select query. if this does not 
		 * match, you will get sql exception.
		 * 
		 *if you run select*, then your both table will match.  
		 */
	}
 // how many types of result set are available in ResultSet interface?
	 /*BY Types:
	  * There are two types of result set:
	  * Scroll
	  * 1. Scroll-able->> Cursor can move any direction
	  * 2. Non scroll-able->> Cursor only moving forward direction.
	  * 
	  * Update
	  * 1. Update-able-->Allow any type of data manipulation
	  * 2. Non update-able--> Read only
	  
	  * Remember:
	  * Scroll-able set is not update-able .they are different between each other.
	  * we can customize our result with any combination.
	  *  default cursor is combination of non update-able and non scroll-able.
	  */
	 
	// how many combination of result set can we create?
	
	 /*Result Set Code
     * Types_ForwadOnly=1003
     * Types_Scroll_Sensitve=1004
     * Types_Scroll_INSensitive=1005
     * 
     * Concecred_readOnly=1007
     * Concered_Update-able=1008
     * 
     * we have to be very careful about combination, mismatch will throw mismatch exception
     * there are six combination we can create. 
     * 
     * Remember: the user permission of the data base is a big deal in the combination.
     * make sure, you have appropriate permission before using the combination.
     */
	// Why do we need all the combination?
	
	/*
	 * with the appropriate combination we can use all the navigational methods.
	 * /* ResultSet interface provide 8 plus navigational method to move cursor.
		 * public boolean next();
		 * public boolean last();
		 * public boolean first();
		 * public boolean beforeLastRow();
		 * public boolean beforeFirstRow();
		 * public boolean afterLast();
		 * public boolean afterFirst();
		 * public boolean absolute();
	 */
}







