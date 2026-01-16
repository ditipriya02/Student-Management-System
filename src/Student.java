// Student.java
// Model class to store student details
import java.util.Scanner;
public class Student {

    //  Fields 
    private int id;
    private String name;
    private int rollNo;
    private String course;

    //  Default Constructor
    public Student() {
        // Default constructor
    }

    //  Parameterized Constructor 
    public Student(int id, String name, int rollNo, String course) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    //  Getters & Setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
// creating object

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Student object
        Student s = new Student();

        // Taking input from user
        System.out.print("Enter Student ID: ");
        s.setId(sc.nextInt());
        sc.nextLine(); // clear buffer

        System.out.print("Enter Student Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Roll Number: ");
        s.setRollNo(sc.nextInt());
        sc.nextLine(); // clear buffer

        System.out.print("Enter Course: ");
        s.setCourse(sc.nextLine());

        // Display student details
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID   : " + s.getId());
        System.out.println("Student Name : " + s.getName());
        System.out.println("Roll No      : " + s.getRollNo());
        System.out.println("Course       : " + s.getCourse());

        sc.close();
    }
}

