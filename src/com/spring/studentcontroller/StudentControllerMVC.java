package com.spring.studentcontroller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Student;

@Controller
@RequestMapping("/student-mvc-tags")
public class StudentControllerMVC {
	@RequestMapping("/account-mvc-tags")
	public String StudentFormTags(Model model) 
	{
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "student-front-mvc-tags/student-account";
	}
	
	@RequestMapping("/studentprocessTAGS")
	public String StudentShow(@Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult) 
	{
		if (bindingResult.hasErrors())
		{
			return "student-front-mvc-tags/student-account";
		}
		else 
		{
			return "student-front-mvc-tags/showdatastudent";
		}
	}
	@InitBinder
	public void isSpaces(WebDataBinder binder) 
	{
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
}
