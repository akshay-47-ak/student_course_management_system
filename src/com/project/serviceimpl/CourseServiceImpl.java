package com.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.project.model.Course;
import com.project.service.CourseService;

/*
This Service Implementation Class is Created by 
Developer Akshay Athavale For Course Service Method Implementation 
on Date:- 05/08/2025 
*/

public class CourseServiceImpl implements CourseService {

  private List<Course> courseList = new ArrayList<Course>();
	
  //The method is Add the Course to Course List
	@Override
	public void addCourse(Course course) {
		
    for(Course c : courseList) {
    	
    	if(c.getCourseId()==course.getCourseId()) {
    		System.out.println("Add Failed: Course with ID " + course.getCourseId() + " already exists.");
    		return;
    	}
    }
    courseList.add(course);
    System.out.println("Course Added Successfully");
		
	}
	
	
  // This method Returns the All Course List 
	@Override
	public List<Course> getAllCourses() {
		if(courseList.isEmpty()) {
			System.err.println("No Course Found!!!");
		}else {
			for(Course c : courseList) {
			System.out.println(c);
			}
		}

		return courseList;
	}

	
  //This Method Return the Course By its ID 	
	@Override
	public Course getCourseById(int courseId) {
		for(Course c : courseList) {
			if(c.getCourseId()== courseId){ 
				System.out.println("Couse found:"+c);
				return c;
			}
		}
		System.out.println("Get Failed: Course with ID " + courseId + " not found.");
		return null;
	}

	
	// This Method Update the Course
	@Override
	public void updateCourse(int courseId, Course updateCourse) {
		for(int i =0; i<courseList.size(); i++) {
			if(courseList.get(i).getCourseId()== courseId) {
				courseList.set(i, updateCourse);
				System.out.println("Student with ID " + courseId + " updated successfully.");
				return;
			}
		}
		System.out.println("Update Failed: Course with ID " + courseId + " not found.");

	}

	
	// This Method Delete the Course 
	@Override
	public void deleteCourse(int courseId) {
	for(Course c : courseList) {
		if(c.getCourseId()== courseId) {
			courseList.remove(c);
			System.out.println("courseId with ID " + courseId + " deleted successfully.");
			return;
		}
	}

	  System.out.println("Delete Failed: Student with ID " + courseId + " not found.");
	}

}
