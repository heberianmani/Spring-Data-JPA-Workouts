package com.heberian.spring.data.jpa.workouts.repository;

import com.heberian.spring.data.jpa.workouts.entity.Guardian;
import com.heberian.spring.data.jpa.workouts.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("heberianmani@gmail.com")
                .firstName("Manikandan")
                .lastName("Thiagarajan")
                //.guardianName("Chithra")
                //.guardianEmail("help@gmail.com")
               // .guardianMobile("9876543210")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("help@gmail.com")
                .name("Chithra")
                .mobile("987654310")
                .build();

        
        Student student = Student.builder()
                .firstName("Ranjitha")
                .emailId("ranji@gmail.com")
                .lastName("M")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("Student List = " + studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students =
                studentRepository.findByFirstName("manikandan");
        System.out.println("Students = "+ students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students =
                studentRepository.findByFirstNameContaining("ra");
        System.out.println("Students = "+ students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("chithra");
        System.out.println("Students = "+ students);
    }

    @Test
    public void printgetStudentByEmailAddress(){
        Student student =
                studentRepository.getStudentByEmailAddress("ranji@gmail.com");
        System.out.println("Students = "+ student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress("heberianmani@gmail.com");
        System.out.println("firstName = "+ firstName);
    }
}