package com.onlyfullstack.bean;

public class Student {

	private String name;
	private String city;
	private int age;
	private String[] courses;
	
	public Student(String name, String city, int age, String[] courses) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.courses = courses;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
}
