package com.example.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kevin = new Student(
                    "Kevin",
                    "kaijun.zhu0629@gmail.com",
                    LocalDate.of(1992, JUNE, 29)
            );

            Student lynn = new Student(
                    "Lynn",
                    "ye.liu9316@gmail.com",
                    LocalDate.of(1993, JANUARY, 6)
            );

            repository.saveAll(
                    List.of(kevin, lynn)
            );
        };
    }
}
