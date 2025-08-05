package com.project.service;

import java.util.List;

import com.project.model.Course;
import com.project.model.Enrollment;
import com.project.model.Student;


public interface EnrollmentService {
     
	// This Method is Created for enroll a student to the Course 
	public void enrollStudent(Student student , Course course , String enrollmentDate);
	
	//This Method returns the List of Enrollment by Student Id 
	public List<Enrollment> getEnrollmentsByStudentId(int studentId);
	
	//This Method returns the list of Enrollment by Course Id
	public List<Enrollment>getEnrollmentsByCourseId(int courseId);
	
    //This Method returns the All Enrollments List 
	public List<Enrollment> getEnrollments();
	
	//This Method cancel Enrollments 
	public void cancelEnrollment(int enrollmentId);
	
	
}
