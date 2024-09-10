package com.jheezy.studentmanagementapp.services;

import com.jheezy.studentmanagementapp.dto.CourseDTO;
import com.jheezy.studentmanagementapp.dto.CourseSaveDTO;
import com.jheezy.studentmanagementapp.dto.CourseUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(CourseSaveDTO courseSaveDTO);


    List<CourseDTO> getAllCourses();

    Course updateCourse(long courseId, CourseUpdateDTO courseUpdateDTO);


    void deleteCourse(long courseId);
}
