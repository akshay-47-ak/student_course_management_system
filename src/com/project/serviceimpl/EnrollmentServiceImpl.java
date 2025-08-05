package com.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.project.model.Course;
import com.project.model.Enrollment;
import com.project.model.Student;
import com.project.service.EnrollmentService;


/*
This Service Implementation Class is Created by 
Developer Akshay Athavale For Enrollment Service Method Implementation 
on Date:- 05/08/2025 
*/


public class EnrollmentServiceImpl implements EnrollmentService {
	
	private List<Enrollment> enrollList = new ArrayList<Enrollment>();

	// This method is used for Enroll Student
	@Override
	public void enrollStudent( int enrollmentId ,Student student, Course course, String enrollmentDate) {
		// TODO Auto-generated method stub
        
		for(Enrollment e : enrollList) {
			if(e.getStudent().getStudentId() == student.getStudentId() && e.getCourse().getCourseId()== course.getCourseId()) {
				System.out.println("Failed To Enroll: Studnet"+student.getName()+"Already Enrolled For This Course"+course.getCourseName());
			}
		}
		
		Enrollment enrollment = new Enrollment(enrollmentId,student,course,enrollmentDate);
		
		
		enrollList.add(enrollment);
	 System.out.println(student.getName()+"Successfullu Enrolled For Course :"+course.getCourseName());
		
			
	}

	
	// This method is return the courses by student id 
	@Override
	public List<Enrollment> getEnrollmentsByStudentId(int studentId) {
		for(Enrollment e : enrollList) {
			if(e.getStudent().getStudentId()==studentId) {
				System.out.println("The Enrollment Taken By"+e.getStudent().getName()+"Id"+e.getStudent().getStudentId()+e);		
			}
		}
		System.out.println("The Student with StudentID: "+studentId+" Not Enrolled Any Course");
		return null;
	}
	
	
 // This method is Return the Course by course id 
	@Override
	public List<Enrollment> getEnrollmentsByCourseId(int courseId) {
		// TODO Auto-generated method stub
		for(Enrollment e : enrollList) {
			if(e.getCourse().getCourseId()==courseId) {
				System.out.println("The Enrollment Taked On The "+e.getCourse().getCourseName()+" Id "+e.getCourse().getCourseId()+e);		
			  
			}
		}
		System.out.println("No Student is Enrolled For this CourseId: "+courseId);
		return null;
	}
	
	
 // This method return the enrollment list 
	@Override
	public List<Enrollment> getEnrollments() {
		for(Enrollment e : enrollList) {
			
			System.out.println(e);
		
		}
		return null;
	}

	//This method is created for the cancel the Enrollment 
	@Override
	public void cancelEnrollment(int enrollmentId) {
	
		for(Enrollment e : enrollList) {
			if(e.getEnrollmentId()==enrollmentId) {
				enrollList.remove(e);
				System.out.println("Enrollemt Deleted Successfully");
				return;
			}
		}
         System.out.println("The Enrollment Not Found for This Enrollment ID"+ enrollmentId);
        
	}
	
	


}
