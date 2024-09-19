package org.generation;

import org.generation.Student.Student;
import org.generation.Course.Course;

public class Main {

	public static void main(String[] args) {
		Student Angel = new Student ("Angel","Andrade",1,60,1);
		Course course = new Course ("JAVA", "JC", 1);
		course.enroll(Angel);
		course.unEnroll(Angel);
		
	}

}
