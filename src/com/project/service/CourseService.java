package com.project.service;



import java.util.List;

import com.project.model.Course;

public interface CourseService {
    
	//The Method is Created for Add Course Service 
	public void addCourse(Course course);
	
	
	//The Method is Created for Get All Student Service 
    public List<Course> getAllCourses();
	
	//The Method is Created for Get Course By Id Service 
	public Course getCourseById(int courseId);
	
	//The Method is Created for Update the Course using Id Service
	public void updateCourse(int courseId , Course updareCourse);
	
	//The Method is Created for Delete Course Using the Id Service 
	public void deleteCourse(int courseId);
	
}
