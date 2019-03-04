package com.okta.developer.docker_microservices.ui.controller;

import com.okta.developer.docker_microservices.ui.dto.TeachingClassDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class SchoolController {

    private final RestTemplate restTemplate;

    public SchoolController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/classes")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    public ResponseEntity<List<TeachingClassDto>> listClasses() {

        return restTemplate
                .exchange("http://school-service/class", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<TeachingClassDto>>() {});
    }
}
