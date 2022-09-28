package com.augusto.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augusto.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
  
}
