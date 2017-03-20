package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
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
