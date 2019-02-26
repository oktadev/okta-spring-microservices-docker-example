package com.okta.developer.microservicedockerspring.ui.controller;


import com.okta.developer.microservicedockerspring.ui.dto.TeachingClassDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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


    @Autowired
    public SchoolController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @GetMapping("/classes")
    public ResponseEntity<List<TeachingClassDto>> listClasses(){

        return restTemplate
                .exchange("http://school-service/class", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<TeachingClassDto>>() {});

    }
}
