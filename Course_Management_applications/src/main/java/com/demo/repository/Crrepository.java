package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Course;

@Repository
public interface Crrepository extends CrudRepository<Course, Integer>
{
 
}