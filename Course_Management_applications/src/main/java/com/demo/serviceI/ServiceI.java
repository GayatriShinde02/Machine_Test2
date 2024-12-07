package com.demo.serviceI;

import java.util.List;

import com.demo.model.Course;

public interface ServiceI {

	void saveData(Course c);

	List<Course> viewAllData(Course c);

}
