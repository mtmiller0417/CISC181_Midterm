package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	public String getMajor ( )
    {
        return this.getMajor();
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;  
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		Calendar calendar  = Calendar.getInstance();
		Date d1 = calendar.getTime();
		
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(d1);
		if ((today.get(Calendar.DAY_OF_YEAR) 
				- birthDate.get(Calendar.DAY_OF_YEAR) > 100))
		{
			throw new PersonException();
		}
		
		this.StudentID = UUID.randomUUID();
		this.Major =Major;	
	}
	
	@Override
	public void PrintName() 
	{
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	
	/*Calendar cal = Calendar.getInstance();
	cal.setTimeInMillis(0);
	cal.set(year[c], month[c], day[c], hour[c], minute[c], second[c]);
	java.util.Date date = cal.getTime();
	dateOfHire[c] = date;*/
}