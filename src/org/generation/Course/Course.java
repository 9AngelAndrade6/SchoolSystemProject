package org.generation.Course;
import org.generation.Student.*;
import java.util.ArrayList;
import java.util.List;

import org.generation.Student.Student;
public class Course {
	String courseName;
	String porfessorName;
	int year;
	List<Student> enrolledStudents = new ArrayList<>();
	
	public Course(String courseName, String porfessorName, int year) {
		this.courseName = courseName;
		this.porfessorName = porfessorName;
		this.year = year;
		this.enrolledStudents = new ArrayList<>();
	}//constructor
	
	public void enroll(Student student){
		if(!enrolledStudents.contains(student)) {
	        enrolledStudents.add(student);
	        System.out.println("El estudiante: " + student.printFullName() + " ha sido inscrito en el curso");
		}//if
		}//enroll
	
	 public void unEnroll(Student student){
	     if(enrolledStudents.contains(student)) {
	    	 enrolledStudents.remove(student);
	    	 System.out.println("El estudiante ha sido removido del curso");
	     }//if
	     
	 }//unEnroll
	
	 public int countStudents(){
	     return enrolledStudents.size();
	 }//countStudents
	 
	 public int bestGrade(){
	     int bestGrade = 0;
	     for (Student student: enrolledStudents) {
			if(student.getGrade()>bestGrade) {
			bestGrade = student.getGrade();
			}//if
	     }//for
	     return bestGrade;
	 }//bestGrade

}//class Courses
