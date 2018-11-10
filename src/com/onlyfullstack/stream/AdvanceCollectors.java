package com.onlyfullstack.stream;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.onlyfullstack.bean.Student;
import com.onlyfullstack.util.JavaInputFixture;

public class AdvanceCollectors {

	public static void main(String[] args) {

		List<Student> students = JavaInputFixture.createList();
		//joiningCollector(students);
		//summaryStatisticsCollector(students);
		//partitioningByCollector(students);
		//groupingByCollector(students);
		mappingByCollector(students);
	}

	private static void joiningCollector(List<Student> students) {
		System.out.println("######## Executing joiningCollector() : ######## ");
		String allStudents = students.stream()
				.map(Student::getName)
				.collect(Collectors.joining(" | "));
		System.out.println("Collectors.joining() : "+allStudents);
		System.out.println("######## Ending the execution of joiningCollector() ######## ");
		
	}
	
	private static void summaryStatisticsCollector(List<Student> students) {
		System.out.println("######## Executing summaryStatisticsCollector() : ######## ");
		DoubleSummaryStatistics statistics = students.stream()
				.mapToDouble(Student::getAge)
				.summaryStatistics();
		
		System.out.println("summaryStatistics() : "+statistics);
		System.out.println("Total Count : "+statistics.getCount());
		System.out.println("Total Sum : " + statistics.getSum());
		System.out.println("Minimum Age : " + statistics.getMin());
		System.out.println("Maximum Age : " + statistics.getMax());
		System.out.println("Average Age : " + statistics.getAverage());
		System.out.println("######## Ending the execution of summaryStatisticsCollector() ######## ");
	}
	
	private static void partitioningByCollector(List<Student> students) {
		System.out.println("######## Executing partitioningByCollector() : ######## ");
		Map<Boolean,List<Student>> partition = students.stream()
				.collect(Collectors.partitioningBy(stud -> stud.getCity().equals("Pune")));
		
		System.out.println("Students living in Pune : "+partition.get(true));
		System.out.println("Students not living in Pune : "+partition.get(false));
		System.out.println("######## Ending the execution of partitioningByCollector() ######## ");
	}
	
	private static void groupingByCollector(List<Student> students) {
		System.out.println("######## Executing groupingByCollector() : ######## ");
		Map<String,List<Student>> groupBy = students.stream()
				.collect(Collectors.groupingBy(Student::getCity));
		
		System.out.println("groupingByCollector : "+groupBy);
		System.out.println("######## Ending the execution of groupingByCollector() ######## ");
	}

	private static void mappingByCollector(List<Student> students) {
		System.out.println("######## Executing mappingByCollector() : ######## ");
		Map<String,Set<String>> mappingBy = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, 
							Collectors.mapping(Student::getName, Collectors.toSet())));
		
		System.out.println("mappingByCollector : "+mappingBy);
		System.out.println("######## Ending the execution of mappingByCollector() ######## ");
	}
}
