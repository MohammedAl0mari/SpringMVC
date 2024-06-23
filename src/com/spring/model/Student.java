package com.spring.model;

import java.util.HashMap;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Required;

import com.spring.validation.checkPhoneNumber;


public class Student {
	@NotNull(message="Required")
	@Size(min=1,message="required")
	private String firstName;
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$" , message = "Not a valid Email")
	private String lastName;
	@NotNull(message = "insert Age please")
	@Min(value=18 , message = "Go watch porn")
	private Integer Age;
	@checkPhoneNumber()
	private String Phonenumber;
	private String Country;
	private String Major;
	private String Language;
	private String[] Courses;
	private HashMap<String,String> Majors;
	
	public Student() {
		Majors = new HashMap<String, String>();
		Majors.put("Computer Science","CS");
		Majors.put("Computer Information Systems" ,"CIS");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public HashMap<String, String> getMajors() {
		return Majors;
	}
	public void setMajors(HashMap<String, String> majors) {
		Majors = majors;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String[] getCourses() {
		return Courses;
	}
	public void setCourses(String[] courses) {
		Courses = courses;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
}
