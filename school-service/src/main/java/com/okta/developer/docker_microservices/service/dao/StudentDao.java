package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Long> {

    List<Student> findByNameContaining(String name);

    List<Student> findByAgeBetween(short smallerAge, short biggerAge);

}
