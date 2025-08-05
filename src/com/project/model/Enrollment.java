package com.project.model;

public  class Enrollment {
	
	//student,course  are the attributes of Enrollment class
	
    private Student student;  
    private Course course;
    private String enrollmentDate;
    private int enrollmentId;
   
    //CREATE CONSTRUCTOR
    
    public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDateString(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Enrollment(int enrollmentId,Student student, Course course , String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.enrollmentId = enrollmentId;
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

	@Override
	public String toString() {
		return "Enrollment [student=" + student + ", course=" + course + ", enrollmentDate=" + enrollmentDate
				+ ", enrollmentId=" + enrollmentId + "]";
	}

	
   
 
}

