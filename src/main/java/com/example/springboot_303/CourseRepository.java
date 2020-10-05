package com.example.springboot_303;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
