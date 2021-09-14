package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    StudentRepository studentRepository;
    @Test
    public void getStudent(){

        Student student  = studentRepository.getStudentByLastName("Dung");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }

//    @Test
//    public void insertDataStudent(){
//        Student student = Student.builder()
//                .firstName("Le ANh")
//                .lastName("Dung")
//                .email("anhdung@")
//                .phone("1234567")
//                .build();
//        studentRepository.save(student);
//
//    }

}
