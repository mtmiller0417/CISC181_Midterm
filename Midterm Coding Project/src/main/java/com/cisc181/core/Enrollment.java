package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment()
	{
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID)
	{
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void setGrade(double Grade)
	{
		this.Grade = Grade;
	}
	
	public double getGrade()
	{
		return this.Grade;
	}

}
