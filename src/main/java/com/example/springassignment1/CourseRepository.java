package com.example.springassignment1 ;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springassignment1.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}