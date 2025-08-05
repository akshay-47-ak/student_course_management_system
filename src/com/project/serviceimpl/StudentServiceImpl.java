package com.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.projec.service.StudentService;
import com.project.model.Student;

public class StudentServiceImpl implements StudentService {

    private List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getStudentId() == student.getStudentId()) {
                System.out.println("Add Failed: Student with ID " + student.getStudentId() + " already exists.");
                return;  // Do not add duplicate
            }
        }
        studentList.add(student);
        System.out.println("Student added successfully: " + student);
    }

    @Override
    public Student getStudentById(int studentId) {
        for (Student s : studentList) {
            if (s.getStudentId() == studentId) {
                System.out.println("Student found: " + s);
                return s;
            }
        }
        System.out.println("Get Failed: Student with ID " + studentId + " not found.");
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Total students: " + studentList.size());
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
        return studentList;
    }

    @Override
    public void updateStudent(int studentId, Student updateStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                studentList.set(i, updateStudent);
                System.out.println("Student with ID " + studentId + " updated successfully.");
                return;
            }
        }
        System.out.println("Update Failed: Student with ID " + studentId + " not found.");
    }

    @Override
    public void deleteStudent(int studentid) {
        for (Student s : studentList) {
            if (s.getStudentId() == studentid) {
                studentList.remove(s);
                System.out.println("Student with ID " + studentid + " deleted successfully.");
                return;
            }
        }
        System.out.println("Delete Failed: Student with ID " + studentid + " not found.");
    }   
}