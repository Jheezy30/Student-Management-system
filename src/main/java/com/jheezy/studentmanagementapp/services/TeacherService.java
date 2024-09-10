package com.jheezy.studentmanagementapp.services;

import com.jheezy.studentmanagementapp.dto.TeacherDTO;
import com.jheezy.studentmanagementapp.dto.TeacherSaveDTO;
import com.jheezy.studentmanagementapp.dto.TeacherUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher saveTeacher(TeacherSaveDTO teacherSaveDTO);

    List<TeacherDTO> getAllTeachers();

    Teacher updateStudent(Long teacherId, TeacherUpdateDTO teacherUpdateDTO);

    void deleteTeacher(long id);
}
