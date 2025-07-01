package io.ethertale.olympiaelkridgeuniversity.schools.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class School {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MainStudy school;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MainStudyBranches branch;
    @Column
    private String description;
    @Column(name = "enrolled_students")
    private int enrolledStudents;

}
