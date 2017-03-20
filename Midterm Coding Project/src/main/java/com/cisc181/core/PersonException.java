package com.cisc181.core;

public class PersonException extends Exception 
{
	private Person Person;

	public void setPerson(Person Person)
	{
		this.Person = Person;
	}

	 @Override
	public String getMessage() {
		 System.out.println("Invalid Person");
		 return "";
	}
	
}