package com.project. model;


public class Student {
	
	//studentId  ,  name  ,  email  are the attributes of student class
    
	private int studentId;  
    private String name;     
    private String email;    

  
    //CREATE CONSTRUCTOR
    
    
    public Student(int studentId, String name, String email) {  //parameter pass
        this.studentId = studentId;                    
        this.name = name;
        this.email = email;
    }

    // GETTER SETTER METHOD
    
    public int getStudentId() {
        return studentId;
    }

   
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

  
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    //ADD TO  STRING METHOD
    
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
