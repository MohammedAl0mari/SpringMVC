package com.spring.studentcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("/account")
	public String studentForm() 
	{
		return "student-front/student-account";
	}
	@RequestMapping("/studentprocess")
	public String getStudentData(@RequestParam("fname") String fName,
								 @RequestParam("lname") String lName,
								 @RequestParam("age") int age ,Model model)
	{
		Student student = new Student();
		student.setFirstName(fName);student.setLastName(lName);student.setAge(age);
		model.addAttribute("myStudent",student);
		return "student-front/showdatastudent";
	}
}
