package com.example.springboot_303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository courseRepository;
    @Override
    public void run(String... args) throws Exception {
        Course course;
        course = new Course("Astrophysics", "Neil D Tyson", "Just a course on Stars", 343);
        courseRepository.save(course);

        course = new Course("Calculus", "Carol D Henley", "Just a course on Calculus", 545);
        courseRepository.save(course);

        course = new Course("Freshman English", "Geraldine Pegram", "Learn your language ", 511);
        courseRepository.save(course);


    }
}
