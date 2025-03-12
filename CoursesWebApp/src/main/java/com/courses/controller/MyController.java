package com.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courses.entites.Course;
import com.courses.services.CourseService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{id}")
	public Course getCoursebyId(@PathVariable Long id) {
		return courseService.getCourse(id);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		//TODO: process POST request
		
		return courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		//TODO: process PUT request
		
		return courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
	    courseService.deleteCourse(id);
	    return ResponseEntity.ok("Course deleted successfully");
	}

	
}
