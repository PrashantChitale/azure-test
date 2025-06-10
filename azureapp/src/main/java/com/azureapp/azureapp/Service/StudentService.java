package com.azureapp.azureapp.Service;

import com.azureapp.azureapp.Student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        Student s1 = new Student(1, "Abhijeet Sharma",
                20, "alice@gmail.com", "Computer Science");

        Student s2 = new Student(2, "Rahul Mehta",
                21, "rahul@gmail.com", "Information Technology");

        Student s3 = new Student(3, "Sneha Joshi",
                22, "sneha@gmail.com", "Electronics");

        Student s4 = new Student(4, "Amit Verma",
                23, "amit@gmail.com", "Mechanical Engineering");

        Student s5 = new Student(5, "Priya Nair",
                20, "priya@gmail.com", "Civil Engineering");


        return List.of(s1, s2, s3, s4, s5);
    }

}
