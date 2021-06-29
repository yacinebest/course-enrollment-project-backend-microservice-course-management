package com.besttocode.microservicecoursemanagement.repository;


import com.besttocode.microservicecoursemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
