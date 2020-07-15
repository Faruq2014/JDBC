	package com.jdbc.preparedStatement_Date;

public class Basics {
		//in java how many date classes are available  ??
		
	/*
	 * in java two date classes are available.
	 * 1. java.util.Date
	 * 2. java.sql.Date
	 * 
	 * 1. java.util.Date --> is design for normal class operation.
	 * a. current date, system date and so on....
	 * b. can handle Date and time by default at a time
	 *  
	 * 2. java.sql.Date-->> is specially design to handle database operation. 
	 * a. insert, delete, update date function.
	 * b. by default only can handle date value. can not handle time value. 
	 * but for time there is  Time and Time stamp class is available which you must handle separately.
	 * 
	 * 
	 * java.sql.Date is the child class of java.util.Date class.
	 * 
	 */
		// how to convert java.util.Date TO  java.sql.Date  ??
		
		/*java.util.Date Udate= new java.util.Date();
		 * long l =Udate.getTime();
		 * java.sql.Date Sdate= new java.sql.Date(l);
		 * 
		 */
		
		//how to convert String to Date  ??
		
		/*by using java.text.SimpleDateFormat; we can convert string to date
		 * String s= "12/24/2012"
		 * 	SimpleDateFormat sdf= new SimpleDateFormat ();
		 * sdf.parse(s);
			 */
		
	//how to convert Date to String   ??
	
			/*by using java.text.SimpleDateFormat; we can convert date  to string
			 * SDF present in the java.text package.
			 * 	SimpleDateFormat sdf= new SimpleDateFormat ();
			 * java.sql.Date dob= rs.getDate(5);  // getting the date from database
				String Sdob=sdf.format(dob);
			 * System.out.println(Sdob);	
				 */
		
		
		
	}
