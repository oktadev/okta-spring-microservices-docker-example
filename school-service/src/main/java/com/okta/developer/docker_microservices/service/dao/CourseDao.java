package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
