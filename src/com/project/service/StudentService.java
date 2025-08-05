package com.project.service;



import java.util.List;

import com.project.model.Student;

public interface StudentService {
	// Method is created for Add Student Service
	public void addStudent(Student student);
	
	//The Object is created for Get The Student info by its id
	public Student getStudentById(int studentId);
	
	//This method is created for Get All Student Service
	public List<Student> getAllStudents();
	
	//This method is called for Update Student
	public void updateStudent(int studentId , Student updateStudent);
	
   //This method is called for Delete the Student 
	public void deleteStudent(int studentid);
	
}
