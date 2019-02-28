package com.okta.developer.docker_microservices.service.dao;

import com.okta.developer.docker_microservices.service.entities.TeachingClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachingClassDao extends JpaRepository<TeachingClass, Long> {}
