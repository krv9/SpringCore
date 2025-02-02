package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String Name;
	private List<String> PhoneNumber;
	private Set<String> Email;
	private Map<String, String>Courses;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, List<String> phoneNumber, Set<String> email, Map<String, String> courses) {
		super();
		Name = name;
		PhoneNumber = phoneNumber;
		Email = email;
		Courses = courses;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Set<String> getEmail() {
		return Email;
	}
	public void setEmail(Set<String> email) {
		Email = email;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	
	
	
}
