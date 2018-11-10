package com.onlyfullstack.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.onlyfullstack.bean.Student;
import com.onlyfullstack.util.JavaInputFixture;

public class IntermediateVsTerminal {

	public static void main(String[] args) throws InterruptedException {
		List<Student> students = JavaInputFixture.createList();
		lazyIntermediateOperations(students);
	}

	private static void lazyIntermediateOperations(List<Student> students) throws InterruptedException {
		System.out.println("######## Executing lazyIntermediateOperations() : ######## ");
		Stream<String> studentStream = students.stream()
												.map(student -> {
													System.out.printf("In Map : %s\n", student.getName());
													return student.getName().toUpperCase();
												});
		
		System.out.println("After map statement");
		Thread.sleep(5000);
		System.out.println("Thread is in Running state now");
		studentStream.collect(Collectors.toList());
		System.out.println("######## Ending the execution of lazyIntermediateOperations() ######## ");
	}

}
