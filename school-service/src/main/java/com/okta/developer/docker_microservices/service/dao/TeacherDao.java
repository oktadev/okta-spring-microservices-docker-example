package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherDao extends JpaRepository<Teacher, Long> {

    List<Teacher> findByNameContaining(String name);
}
