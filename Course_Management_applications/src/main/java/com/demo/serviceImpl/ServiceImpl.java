package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Course;
import com.demo.repository.Crrepository;
import com.demo.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI
{
   @Autowired
   Crrepository cr;
	
	@Override
	public void saveData(Course c) 
	{
		cr.save(c);
	}

	@Override
	public List<Course> viewAllData(Course c)
	{
		
		return (List<Course>) cr.findAll();
	}

}
