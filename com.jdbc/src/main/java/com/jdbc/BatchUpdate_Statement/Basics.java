package com.jdbc.BatchUpdate_Statement;

public class Basics {

	public static void main(String[] args) {
//what is batch processing?
		/*Batch is group of queries. 
		 * sending to the data base at one time.
		 * the data base compile each query one by one.
		 * the data base execute each query one by one.
		 * than send the result together at a time.
		 * each query is one individual object.
		 * all the query is inside a encapsulated object is called batch.
		 */
		
		/* we can create batch update for:
		 * 1. simple statement
		 * 2. prepare statement.
		 * we create a statement then we write
		 * public void addBatch(); it is a void method. the execution is>>>
		 * stmt.addBatch(query); // to create individual object. then
		 * public int[] executeBatch()Throw batch exception.
		 * stmt.executeBatch() // to create batch and send  the request to the data base.
		 *  c []=stmt.executeBatch()
		 * internally they use list (collection) to process batch.
		 * to execute it is first in first out FIFO process.
		 * public void clearBatch() to clear the batch. it is not necessary. as soon as you 
		 * close connection it will remove it any way. 
		 */
		
		/*you can not place any type of select query in the batch.
		 * if you do, there is no compile time error but it will throw batch exception at run time.
		 * it allows any number non select query such as insert, update, delete.
		 * it is also allows DDL command such as create, drop.
		 * it is also allows any number table. that means you can place same batch for any 
		 * number of table. 
		 */
		
		/*the return types is int value.
		 * it will show you how many rows are affected.
		 */
		
		/*simple statement will take arguments
		 * prepare statement will not take any arguments
		 * 
		 */
	}

}
