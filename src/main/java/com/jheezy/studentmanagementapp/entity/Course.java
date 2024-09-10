package com.jheezy.studentmanagementapp.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "course")  // Commonly lowercase or snake_case
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically generate IDs
    @Column(name = "course_id")
    private long courseId;

    @Column(name = "course_name", length = 150)
    private String courseName;

    @Column(name = "syllabus", length = 100)
    private String syllabus;

    @Column(name = "duration")
    private Integer duration;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)  // Optional cascade settings
    private Set<Batch> batches;


    // Lombok or Constructors, Getters, and Setters
}

