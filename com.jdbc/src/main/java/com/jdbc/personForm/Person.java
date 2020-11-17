package com.jdbc.personForm;
public class Person {
	
	private int personId;
	   private String firstName;
	   private String middleName;
	   private String lastName;
	   private String email;
	   private String phone;
	   /*
	   public Person(int personId, String firstName, String middleName, String lastName, String email, String phone) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	*/
	   //...constructors, getters, and setters
	public int getPersonId() {
		return personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	}