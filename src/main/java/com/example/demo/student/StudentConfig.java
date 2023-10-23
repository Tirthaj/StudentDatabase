package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tirthaj = new Student(
                    1L,
                    "Tirthaj",
                    LocalDate.of(1991, Month.AUGUST, 28),
                    "tirthaj.rikame@gmail.com"
            );

            Student prags = new Student(
                    "Pragati",
                    LocalDate.of(2000, Month.JULY, 3),
                    "pragati.sivasamy@gmail.com"
            );

            repository.saveAll(
                    List.of(tirthaj, prags)
            );
        };
    }

}
