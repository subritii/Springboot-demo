package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;



@Configuration
public class StudentConfig {
    private List<Student> studentList;

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Mariam = new Student(
                    "Mariam",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "Mariam@gmail.com"
            );

            Student Alex = new Student(
                    "Alex",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    "Alex@gmail.com"
            );

            studentList = new ArrayList<>();
            studentList.add(Mariam);
            studentList.add(Alex);
            repository.saveAll(studentList);
        };
    }
}
