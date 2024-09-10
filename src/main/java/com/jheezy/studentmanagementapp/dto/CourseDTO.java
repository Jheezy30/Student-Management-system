package com.jheezy.studentmanagementapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private long courseId;

    private String courseName;

    private String syllabus;

    private Integer duration;
}
