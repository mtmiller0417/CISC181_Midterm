package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> cList = new ArrayList<Course>();
	static ArrayList<Semester> semList = new ArrayList<Semester>();
	static ArrayList<Section> secList = new ArrayList<Section>();
	static ArrayList<Student> studentList = new ArrayList<Student>();

	@BeforeClass
	public static void setup() throws PersonException 
	{
		//ArrayList<Course> cList = new ArrayList<Course>();
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		cList.add(c1); cList.add(c2); cList.add(c3);
		
		//ArrayList<Semester> semList = new ArrayList<Semester>();
		Semester s1 = new Semester();
		Semester s2 = new Semester();
		semList.add(s1);semList.add(s2);
		
	//	ArrayList<Section> secList = new ArrayList<Section>();
		Section ss1 = new Section();
		Section ss2 = new Section();
		Section ss3 = new Section();
		Section ss4 = new Section();
		Section ss5 = new Section();
		Section ss6 = new Section();
		secList.add(ss1);secList.add(ss2);secList.add(ss3);
		secList.add(ss4);secList.add(ss5);secList.add(ss6);
		// (DONE) Add three course records, add them to an ArrayList of courses 
		// (DONE)Add two semesters, fall and spring, add to an ArrayList of semesters
		// Add two Sections for each Course & Semester (total of six Sections),  
		//			add them to an ArrayList of Section
		// Create ten Student records, add them to an ArrayList of Student.
		
		
		/*int x = 0; 
		for(Semester s: semList)
		{
			for(Course c: cList)
			{
				//wtf goes here????
			}
		}*/
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(1998, 04, 19, 7, 35, 9);
		java.util.Date date = cal.getTime();
		Date DOB = date;
		//Bad Date Below
		
		Calendar cal2 = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(1898, 04, 19, 7, 35, 9);
		java.util.Date date2 = cal.getTime();
		Date DOB2 = date2;
		
		//ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student("Matthew", "T", "Miller", DOB,
				eMajor.COMPSI, "Address","3021234567", "xxx@udel.edu" );
		Student student2 = new Student("John", "J", "Walker", DOB, 
				eMajor.BUSINESS, "Address","3021234567", "xxx@udel.edu" );
		Student student3 = new Student("Julia", "K", "Smith", DOB, 
				eMajor.CHEM, "Address","3021234567", "xxx@udel.edu" );
		Student student4 = new Student("Ryan", "P", "Patrickson", DOB, 
				eMajor.PHYSICS, "Address","3021234567", "xxx@udel.edu" );
		Student student5 = new Student("Ellito", "H", "Venzel", DOB, 
				eMajor.COMPSI, "Address","3021234567", "xxx@udel.edu" );
		Student student6 = new Student("Chance", "J", "Morris", DOB, 
				eMajor.PHYSICS, "Address","3021234567", "xxx@udel.edu" );
		Student student7 = new Student("Alexis", "H", "Robert", DOB, 
				eMajor.BUSINESS, "Address","3021234567", "xxx@udel.edu" );
		Student student8 = new Student("Julianna", "S", "Cohen", DOB, 
				eMajor.NURSING, "Address","3021234567", "xxx@udel.edu" );
		Student student9 = new Student("Nathan", "R", "Ortega", DOB, 
				eMajor.CHEM, "Address","3021234567", "xxx@udel.edu" );
		Student student10 = new Student("Josh", "S", "Hamilton", DOB, 
				eMajor.BUSINESS, "Address","3021234567", "xxx@udel.edu" );
		studentList.add(student1);studentList.add(student2);studentList.add(student3);
		studentList.add(student4);studentList.add(student5);studentList.add(student6);
		studentList.add(student7);studentList.add(student8);studentList.add(student9);
		studentList.add(student10);
		//test(studentList, secList, semList, cList);
		
		
	}
	@Test
	public void test()
	{
		
		double[] grades = {51.5, 97.1, 85, 73, 100, 79.1, 88, 92, 64.3, 70};
		
		ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();
		ArrayList<Double> enrolled = new ArrayList<Double>();
		
		
		for(Section s: secList)
		{
			int x = 0;
			double total = 0;
			UUID sec = new UUID(0,25);
			
			for(Student ss: studentList)
			{
				UUID student = new UUID(0, 25);
				Enrollment e = new Enrollment(student, sec);
				e.setGrade(grades[x]);
				enrollList.add(e);
				total += e.getGrade();
				x++;
				
			}
			enrolled.add(total);
		}
		
		

		double avgGrade = 0;
		for(double d: enrolled)
		{
			avgGrade += d;
		}
		avgGrade = avgGrade/enrolled.size();
		
		int STUDENT = 2;// second student
		double testGrade = enrollList.get(STUDENT).getGrade();
		String letterGrade = "";
		if(testGrade >= 90)
		{
			letterGrade = "A";
		}
		else if(testGrade >= 80)
		{
			letterGrade = "B";
		}
		else if(testGrade >= 70)
		{
			letterGrade = "C";
		}
		else if(testGrade >= 60)
		{
			letterGrade = "D";
		}
		else
		{
			letterGrade = "F";
		}
		
		double GPA;
		if(letterGrade.equals("A"))
		{
			GPA = 4.0;
		}
		else if(letterGrade.equals("B"))
		{
			GPA = 3.0;
		}
		else if(letterGrade.equals("C"))
		{
			GPA = 2.0;
		}
		else if(letterGrade.equals("D"))
		{
			GPA = 1.0;
		}
		else 
		{
			GPA = 0.0;
		}
		
		assertEquals(true, 3.0 == GPA);
		
		studentList.get(0).setMajor(eMajor.BUSINESS);//deal with later

		double CORRECTAVGGRADE = 800/(grades.length); // = 80(Average Grade)
		int FIRSTSECTION = 0;
		double TESTVALUE = (enrolled.get(FIRSTSECTION))/(grades.length);
		
		assertEquals(true, (TESTVALUE == CORRECTAVGGRADE));//The Average Grades for one section is Equal
	}
}
		//Enroll the ten students you created in each of the Sections you created.  
		//        Grade each student (pick your own grade values)
		// Determine each student’s GPA, test it with an assertEquals.
		// Determine each course’s average grade, test it with an assertEqual.
		// Change the major of one of the Student records.
		