package com.onlyfullstack.lambdas;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.onlyfullstack.bean.Student;
import com.onlyfullstack.util.JavaInputFixture;

public class MethodReference {

	public static void main(String[] args) {
		staticReference_WithoutMethodRef();
		staticReference_WithMethodRef();
		
		instanceReferenceWithClass_WithMethodRef();
		instanceReferenceWithClass_WithoutMethodRef();
		
		instanceReference_WithoutMethodRef();
		instanceReference_WithMethodRef();
	}
	
	private static void printMe(Integer input) {
		System.out.println("Printing "+ input);
	}
	
	private static void staticReference_WithoutMethodRef() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.filter(i -> i%2==0 )
			.forEach(i -> MethodReference.printMe(i));
	}
	
	private static void staticReference_WithMethodRef() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.filter(i -> i%2==0 )
			.forEach(MethodReference::printMe);
	}

	private static void instanceReference_WithoutMethodRef() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.filter(i -> i%2==0 )
			.forEach((i -> System.out.println(i)));
	}
	
	private static void instanceReference_WithMethodRef() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		stream.filter(i -> i%2==0 )
			.forEach(System.out::println);
	}

	private static void instanceReferenceWithClass_WithoutMethodRef() {
		List<Student> students = JavaInputFixture.createList();
		Set<String> names = students.stream()
				.map(student -> student.getName()) // this will convert the Student Stream into String Stream by 
										          // applying the getName()
				.collect(Collectors.toSet());
		
		System.out.printf("Names of all students %s\n", names);
	}
	
	private static void instanceReferenceWithClass_WithMethodRef() {
		List<Student> students = JavaInputFixture.createList();
		Set<String> names = students.stream()
				.map(Student::getName) // this will convert the Student Stream into String Stream by 
									   // applying the getName()
				.collect(Collectors.toSet());
		
		System.out.printf("Names of all students %s\n", names);
	}
}
