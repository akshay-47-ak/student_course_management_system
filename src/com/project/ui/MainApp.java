package com.project.ui;

	import com.project.model.*;
	import com.project.service.*;
	import com.project.serviceimpl.*;

	import java.util.Scanner;
	import java.util.List;

	public class MainApp {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Service Layer Initialization
	        StudentService studentService = new StudentServiceImpl();
	        CourseService courseService = new CourseServiceImpl();
	        EnrollmentService enrollmentService = new EnrollmentServiceImpl();

	        // Simple Admin Login
	        System.out.print("Enter Admin Username: ");
	        String username = sc.next();
	        System.out.print("Enter Admin Password: ");
	        String password = sc.next();

	        if (username.equals("admin") && password.equals("admin123")) {
	            System.out.println("Login Successful.\n");

	            int choice;
	            do {
	                System.out.println("\n=== Student Course Enrollment System ===");
	                System.out.println("1. Add Student");
	                System.out.println("2. View All Students");
	                System.out.println("3. Add Course");
	                System.out.println("4. View All Courses");
	                System.out.println("5. Enroll Student to Course");
	                System.out.println("6. View Enrollments by Student ID");
	                System.out.println("7. View Enrollments by Course ID");
	                System.out.println("8. Cancel Enrollment");
	                System.out.println("9. View All Enrollments");
	                System.out.println("0. Exit");
	                System.out.print("Enter your choice: ");
	                choice = sc.nextInt();

	                switch (choice) {
	                    case 1 -> {
	                        System.out.print("Enter Student ID: ");
	                        int sid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Enter Email: ");
	                        String email = sc.nextLine();

	                        Student student = new Student(sid, name, email);
	                        studentService.addStudent(student);
	                    }
	                    case 2 -> {
	                        List<Student> students = studentService.getAllStudents();
	                        if (students.isEmpty()) {
	                            System.out.println("No students available.");
	                        }
	                    }
	                    case 3 -> {
	                        System.out.print("Enter Course ID: ");
	                        int cid = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Enter Course Name: ");
	                        String cname = sc.nextLine();
	                        System.out.print("Enter Description: ");
	                        String desc = sc.nextLine();

	                        Course course = new Course(cid, cname, desc);
	                        courseService.addCourse(course);
	                    }
	                    case 4 -> {
	                        List<Course> courses = courseService.getAllCourses();
	                        if (courses.isEmpty()) {
	                            System.out.println("No courses available.");
	                        }
	                    }
	                    case 5 -> {
	                        System.out.print("Enter Enrollment ID: ");
	                        int eid = sc.nextInt();
	                        System.out.print("Enter Student ID: ");
	                        int sid = sc.nextInt();
	                        System.out.print("Enter Course ID: ");
	                        int cid = sc.nextInt();
	                        sc.nextLine(); // consume newline
	                        System.out.print("Enter Enrollment Date (yyyy-mm-dd): ");
	                        String date = sc.nextLine();

	                        Student student = studentService.getStudentById(sid);
	                        Course course = courseService.getCourseById(cid);

	                        if (student != null && course != null) {
	                            enrollmentService.enrollStudent(eid, student, course, date);
	                        } else {
	                            System.out.println("Invalid Student or Course ID.");
	                        }
	                    }
	                    case 6 -> {
	                        System.out.print("Enter Student ID: ");
	                        int sid = sc.nextInt();
	                        enrollmentService.getEnrollmentsByStudentId(sid);
	                    }
	                    case 7 -> {
	                        System.out.print("Enter Course ID: ");
	                        int cid = sc.nextInt();
	                        enrollmentService.getEnrollmentsByCourseId(cid);
	                    }
	                    case 8 -> {
	                        System.out.print("Enter Enrollment ID to cancel: ");
	                        int eid = sc.nextInt();
	                        enrollmentService.cancelEnrollment(eid);
	                    }
	                    case 9 -> {
	                        enrollmentService.getEnrollments();
	                    }
	                    case 0 -> {
	                        System.out.println("Exiting application...");
	                    }
	                    default -> {
	                        System.out.println("Invalid choice. Try again.");
	                    }
	                }
	            } while (choice != 0);
	        } else {
	            System.out.println("Invalid Credentials. Exiting.");
	        }

	        sc.close();
	    }
	}


