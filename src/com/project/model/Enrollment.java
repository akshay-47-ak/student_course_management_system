package com.project.model;

public  class Enrollment {
	
	//student,course  are the attributes of Enrollment class
	
    private Student student;  
    private Course course;    

   
    //CREATE CONSTRUCTOR
    
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    //GETTER SETTER METHOD
    
    public Student getStudent() {
        return student;
    }

    
    public void setStudent(Student student) {
        this.student = student;
    }

   
    public Course getCourse() {
        return course;
    }

   
    public void setCourse(Course course) {
        this.course = course;
    }

   
    //ADD TO STRING METHOD
    
    @Override
    public String toString() {
        return student.getName() + " is enrolled in " + course.getCourseName();
    }
}

