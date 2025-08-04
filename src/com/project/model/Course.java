package com.project.model;


public class Course {
	
	//courseId,courseName,description  are the attributes of Course class
	
    private int courseId;         
    private String courseName;    
    private String description;   

    //CREATE CONSTRUCTOR
    
    public Course(int courseId, String courseName, String description) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
    }

    //GETTER SETTER METHOD
    
    public int getCourseId() {
        return courseId;
    }

   
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    
    public String getCourseName() {
        return courseName;
    }

   
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

   
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }
    

  //ADD TO STRING METHODS
    
    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

