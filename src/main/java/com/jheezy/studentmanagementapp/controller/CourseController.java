package com.jheezy.studentmanagementapp.controller;

import com.jheezy.studentmanagementapp.dto.CourseDTO;
import com.jheezy.studentmanagementapp.dto.CourseSaveDTO;
import com.jheezy.studentmanagementapp.dto.CourseUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Course;
import com.jheezy.studentmanagementapp.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CourseController {
    @Autowired
    private CourseService service;

    @RequestMapping("/add_course")
    public Course saveCourse(@RequestBody CourseSaveDTO courseSaveDTO) {
        return service.saveCourse(courseSaveDTO);
    }

    @RequestMapping("/all_courses")
    public List<CourseDTO> getAllCourses() {
        return service.getAllCourses();
    }

    @RequestMapping("/update_course/{course_id}")
    public Course updateCourse(@PathVariable("course_id") long courseId, @RequestBody CourseUpdateDTO courseUpdateDTO) {
        return service.updateCourse(courseId, courseUpdateDTO);
    }

    @DeleteMapping("/api/delete_course/{course_id}")
    public String deleteCourse(@PathVariable("course_id") long courseId) {
        service.deleteCourse(courseId);
        return "Course deleted successfully";
    }




}
