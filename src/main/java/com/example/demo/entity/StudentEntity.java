package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Student") @Table(name = "student", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique",
                columnNames = "email")}) @Data public class StudentEntity {
    @Id @GeneratedValue @Column(name = "id", updatable = false)
    @Setter(value = AccessLevel.PRIVATE) private Long id;
    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;
    @Column(name = "age", nullable = false) private Integer age;
}
