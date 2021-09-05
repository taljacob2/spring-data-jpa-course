package com.example.demo;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean CommandLineRunner commandLineRun(
            StudentRepository studentRepository) {
        return new CommandLineRunner() {
            @Override public void run(String... args) throws Exception {
                StudentEntity student1 = getStudentEntity1();
                StudentEntity student2 = getStudentEntity2();
                studentRepository.save(student1);
                studentRepository.save(student2);
            }
        };
    }

    private StudentEntity getStudentEntity1() {
        StudentEntity student = new StudentEntity();
        student.setFirstName("Maria");
        student.setLastName("Jones");
        student.setEmail("maria.jones@gmail.com");
        student.setAge(21);
        return student;
    }

    private StudentEntity getStudentEntity2() {
        StudentEntity student = new StudentEntity();
        student.setFirstName("Tal");
        student.setLastName("Jacob");
        student.setEmail("tal.jacob@gmail.com");
        student.setAge(70);
        return student;
    }
}
