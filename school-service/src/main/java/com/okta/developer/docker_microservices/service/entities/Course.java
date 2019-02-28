package com.okta.developer.docker_microservices.service.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull private String name;
    @NonNull private int workload;
    @NonNull private short rate;
}
