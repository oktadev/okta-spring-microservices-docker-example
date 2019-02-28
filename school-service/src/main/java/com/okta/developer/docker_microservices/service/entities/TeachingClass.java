package com.okta.developer.docker_microservices.service.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint( name = "un_class", columnNames = {
        "course_id", "teacher_id", "year"
}))
public class TeachingClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_class_course"))
    @NotNull
    @NonNull
    private Course course;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_class_teacher"))
    @NotNull
    @NonNull
    private Teacher teacher;

    @ManyToMany
    @JoinTable(
            foreignKey = @ForeignKey(name = "fk_class_student"),
            inverseForeignKey = @ForeignKey(name = "fk_student_class")
    )
    @NonNull private List<Student> students;
    @NonNull private int year;


}
