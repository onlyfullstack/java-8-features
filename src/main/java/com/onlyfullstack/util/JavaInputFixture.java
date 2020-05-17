package com.onlyfullstack.util;

import java.util.Arrays;
import java.util.List;

import com.onlyfullstack.bean.Student;

public class JavaInputFixture {
	
	public static List<Student> createList() {

		Student student1 = new Student("Saurabh", "Pune", 26, new String[] {"Java","Spring","Hibernate"});
		Student student2 = new Student("Robert", "Pune", 25, new String[] {".Net","HTML","CSS"});
		Student student3 = new Student("John", "Mumbai", 21, new String[] {"Typescript","Angular 4"});
		Student student4 = new Student("Roman", "Pune", 18, new String[] {"ReactJS","JavaScript","Fidler"});
		Student student5 = new Student("Randy", "Mumbai", 17, new String[] {"Java","Spring Cloud","Spring Data"});
		
		return Arrays.asList(new Student[] {student1, student2, student3, student4, student5});
	}

}
