package com.okta.developer.docker_microservices.service.services;

import com.okta.developer.docker_microservices.service.dao.TeachingClassDao;
import com.okta.developer.docker_microservices.service.dtos.TeachingClassDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeachingClassServiceDB implements TeachingClassService {

    private final TeachingClassDao teachingClassDAO;

    @Autowired
    public TeachingClassServiceDB(TeachingClassDao teachingClassDAO) {
        this.teachingClassDAO = teachingClassDAO;
    }


    @Override
    public List<TeachingClassDto> listClasses() {

        return teachingClassDAO
                .findAll()
                .stream()
                .map( classObj -> TeachingClassDto
                        .builder()
                        .teacherName( classObj.getTeacher().getName() )
                        .teacherId( classObj.getTeacher().getId() )
                        .numberOfStudents( classObj.getStudents().size() )
                        .classId( classObj.getId() )
                        .courseId( classObj.getCourse().getId() )
                        .courseName( classObj.getCourse().getName() )
                        .year( classObj.getYear() )
                        .build()
                )
                .collect(Collectors.toList());
    }
}
