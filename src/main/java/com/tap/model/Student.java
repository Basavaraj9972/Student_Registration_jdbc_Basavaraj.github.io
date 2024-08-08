package com.tap.model;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private String lastname;
	private String phoneNumber;
	private String email;
	private int age;
	private LocalDate dateOfBirth;
	private String gender;
	private String department;
	private int yearOfPassing;
	private String skills;
	
	public Student() {

	}

	public Student(String name, String lastname, String phoneNumber, String email, int age, LocalDate dateOfBirth,
			String gender, String department, int yearOfPassing, String skills) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.department = department;
		this.yearOfPassing = yearOfPassing;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getdateOfBirth() {
		return dateOfBirth;
	}

	public void setdateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", age=" + age + ", date=" + dateOfBirth + ", gender=" + gender + ", department=" + department
				+ ", yearOfPassing=" + yearOfPassing + ", skills=" + skills + "]";
	}
	
	
	

}
