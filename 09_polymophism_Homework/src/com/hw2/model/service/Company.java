package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
private  Employee[] employees;
private int employeeCount;

public Company(int size) {
	// TODO Auto-generated constructor stub
}


public Employee[] getEmployees() {
	return employees;
}
public void setEmployees(Employee[] employees) {
	this.employees = employees;
}
public int getEmployeeCount() {
	return employeeCount;
}
public void setEmployeeCount(int employeeCount) {
	this.employeeCount = employeeCount;
}
@Override
public void addPerson(Person person) {
	// TODO Auto-generated method stub
	
}
@Override
public void removePerson(String id) {
	// TODO Auto-generated method stub
	
}
@Override
public void displayAllPersons() {
	// TODO Auto-generated method stub
	
}



}
