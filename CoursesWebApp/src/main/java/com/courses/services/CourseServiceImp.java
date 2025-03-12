package com.courses.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.dao.CourseDao;
import com.courses.entites.Course;

@Service
public class CourseServiceImp implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(Long id) {
		return courseDao.getOne(id);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long id) {
		// TODO Auto-generated method stub
		Course entity = courseDao.getOne(id);
		courseDao.delete(entity);
		
	}

	







}
