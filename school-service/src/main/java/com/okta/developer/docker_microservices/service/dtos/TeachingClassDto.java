package com.okta.developer.docker_microservices.service.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeachingClassDto {
    private long classId;
    private String teacherName;
    private long teacherId;
    private String courseName;
    private long courseId;
    private int numberOfStudents;
    private int year;
}
