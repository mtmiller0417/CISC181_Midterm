package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test(expected = PersonException.class)//Test PersonException for bad Phone Number
	public void phoneNumberExceptiontest() throws PersonException 
	{
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(2000, 04, 19, 7, 35, 9);
		java.util.Date date2 = cal.getTime();
		Date DOB = date2;
		Student student = new Student("Matthew", "T", "Miller", DOB,eMajor.COMPSI, "Address","123", "xxx@udel.edu" );
	}	
	
	@Test(expected = PersonException.class)//Test PersonException for bad birthday
	public void bdayExceptiontest() throws PersonException 
	{
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(1700, 04, 19, 7, 35, 9);
		java.util.Date date2 = cal.getTime();
		Date DOB = date2;
		Student student = new Student("Matthew", "T", "Miller", DOB,eMajor.COMPSI, "Address","3021234567", "xxx@udel.edu" );
	}	
	
	
	@Test//Test PersonException for Correct Phone Number and DOB(No error expected)
	public void noErrorTest() throws PersonException 
	{
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(2000, 04, 19, 7, 35, 9);
		java.util.Date date2 = cal.getTime();
		Date DOB = date2;
		Student student = new Student("Matthew", "T", "Miller", DOB,eMajor.COMPSI, "Address","3021324987", "xxx@udel.edu" );
	}	
	

	@Test
	public void StaffTest() throws PersonException
	{
		double[] salary = {45000.00, 40000.00, 60000.00, 80000.00, 50000.00};
		
		
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		
		int counter = -1;
		int divisor = 0;
		for(double x: salary)
		{
			counter++;
			Staff s = new Staff(eTitle.MRS);
			s.setSalary(salary[counter]);
			staffList.add(s);		
			divisor++;
		}
		
		double total = 0;
		for(Staff x: staffList)
		{
			total = total + x.getSalary(); 
		}
		assertEquals(true, ((45000+40000+60000+80000+50000)/divisor == total/divisor));
	}
}
