package com.jheezy.studentmanagementapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseUpdateDTO {

    private long courseId;

    private String courseName;

    private String syllabus;

    private Integer duration;
}
