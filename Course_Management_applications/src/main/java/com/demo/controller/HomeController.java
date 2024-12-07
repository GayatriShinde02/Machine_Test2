package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Course;
import com.demo.serviceI.ServiceI;

@Controller
public class HomeController 
{
 
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String saveData(@ModelAttribute Course c)
	{
		si.saveData(c);
		return "data save successfully";
	}
	
	@RequestMapping("/")
	public String viewAllData(@ModelAttribute Course c)
	{
		List<Course> al=si.viewAllData(c);
		return "success";
	}
	
}
