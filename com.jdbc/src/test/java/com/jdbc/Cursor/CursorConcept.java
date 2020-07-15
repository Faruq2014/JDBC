package com.jdbc.Cursor;

public class CursorConcept {

	public static void main(String[] args) {
		/*
		 * After executing the sql query the result will be stored a special memory of 
		 * database software, called Context area. To access context area and access result set 
		 * organizly Cursor concept is present in the database. In Java there are three types 
		 * of cursor such as enumeration, iterator and list iterator. 
		 * in jdbc there are two types of cursor.
		 * Implicit cursor and explicit cursor.
		 * 
		 * Implicit Cursor:deafult cursor to access query result from context area. automatically
		 * created by database software. 
		 * 
		 * Explicit Cursor:Created by developer to access the query result from the context area.
		 *  three types Explicit cursor.
		 * SYS_REF_CURSOR: this cursor is responsible to access all select query. 
		 * %ROW_COUNT: this cursor is responsible for non select query such as insert, update,
		 * delete and so on. it is telling us how many row effected.
		 * %FOUND: it is responsible for true and false for non select query. it is telling us 
		 * either any row effected or not.  
		 *  
		 */

	}

}
