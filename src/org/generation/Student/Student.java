package org.generation.Student;

public class Student {
       String firstName;
       String lastName;
       int registration;
       public int grade;
       int year;
       
    public Student (String firstName, String lastName, 
    				int registration, int grade,int year) {
			this.firstName=firstName.toUpperCase();
			this.lastName=lastName.toUpperCase();
			this.registration=registration;
			this.grade=grade;
			this.year=year;
	}//constructor 1
    public Student (String firstName, String lastName, int grade,int year) {
			this (firstName, lastName, 0, grade, year);//se agrega registration
    }//constructor 2
    public Student (String firstName, String lastName) {
		this (firstName, lastName, 0, 1);//se agrega grade y año
    }//constructor 3
    
       
       public String printFullName(){
    	   return firstName + " " + lastName;
    	       
    	   }// printFullName
       public boolean isApproved(int grade){
    	   if(grade >= 60) {
    		 return true;
    	   }//if
		return false;
    	   } // isApproved
       public int changeYearIfApproved(){
    	   if (isApproved(grade)) {
    		   year = year += 1;
    		   System.out.println("Congratulations");
    	   }// if (isApproved(grade)
    	   return year;
    	   }//changeYearIfApproved
       public int getGrade(){
    	   return grade;
       }//getGrade
}// class Student
