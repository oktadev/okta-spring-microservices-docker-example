package com.okta.developer.docker_microservices.ui.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeachingClassDto {
    private long classId;
    private String teacherName;
    private long teacherId;
    private String courseName;
    private long courseId;
    private int numberOfStudents;
    private int year;
}
