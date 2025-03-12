package com.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entites.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
