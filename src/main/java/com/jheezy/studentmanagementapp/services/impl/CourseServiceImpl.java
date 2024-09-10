package com.jheezy.studentmanagementapp.services.impl;

import com.jheezy.studentmanagementapp.dto.CourseDTO;
import com.jheezy.studentmanagementapp.dto.CourseSaveDTO;
import com.jheezy.studentmanagementapp.dto.CourseUpdateDTO;
import com.jheezy.studentmanagementapp.dto.TeacherUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Course;
import com.jheezy.studentmanagementapp.repository.CourseRepository;
import com.jheezy.studentmanagementapp.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Course saveCourse(CourseSaveDTO courseSaveDTO) {
        Course course = Course.builder()
                .courseId(courseSaveDTO.getCourseId())
                .courseName(courseSaveDTO.getCourseName())
                .syllabus(courseSaveDTO.getSyllabus())
                .duration(courseSaveDTO.getDuration())
                .build();

        return courseRepository.save(course);
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return courseRepository.findAll().stream()
                .map(course -> new CourseDTO(
                        course.getCourseId(),
                        course.getCourseName(),
                        course.getSyllabus(),
                        course.getDuration()
                )).collect(Collectors.toList());
    }

    @Override
    public Course updateCourse(long courseId, CourseUpdateDTO courseUpdateDTO) {
        Course course = courseRepository.findById(courseId).get();
        if (Objects.nonNull(courseUpdateDTO.getCourseId())) {
            course.setCourseId(courseUpdateDTO.getCourseId());
        }
        if (Objects.nonNull(courseUpdateDTO.getCourseName()) && !"".equalsIgnoreCase(courseUpdateDTO.getCourseName())) {
            course.setCourseName(courseUpdateDTO.getCourseName());
        }
        if (Objects.nonNull(courseUpdateDTO.getSyllabus()) && !"".equalsIgnoreCase(courseUpdateDTO.getSyllabus())) {
            course.setSyllabus(courseUpdateDTO.getSyllabus());
        }
        if (Objects.nonNull(courseUpdateDTO.getDuration())) {
            course.setDuration(courseUpdateDTO.getDuration());
        }

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        courseRepository.deleteById(courseId);
    }


}
