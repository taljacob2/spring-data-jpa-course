package com.example.demo;

import com.example.demo.pojo.Student;
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
                Student student = new Student();
                student.setFirstName("Maria");
                student.setLastName("Jones");
                student.setEmail("maria.jones@gmail.com");
                student.setAge(21);
                studentRepository.save(student);
            }
        };
    }
}
