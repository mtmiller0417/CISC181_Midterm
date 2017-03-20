package com.cisc181.core;

import java.util.UUID;

public class Course
{
	private String CourseName;
	private UUID CourseID;
	private int gradePoints;
	private String Major;
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public int getGradePoints() {
		return gradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

}
