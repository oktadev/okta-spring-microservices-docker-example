package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.dtos.TeachingClassDto;

import java.util.List;

public interface TeachingClassService {

    List<TeachingClassDto> listClasses();
}
