package com.jheezy.studentmanagementapp.controller;


import com.jheezy.studentmanagementapp.dto.*;
import com.jheezy.studentmanagementapp.entity.Teacher;
import com.jheezy.studentmanagementapp.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TeacherController {
    @Autowired
    private TeacherService service;


    @RequestMapping("/add_teacher")
    public Teacher saveStudent(@RequestBody TeacherSaveDTO teacherSaveDTO) {
        return service.saveTeacher(teacherSaveDTO);
    }

    @GetMapping("/get_all_teachers")
    public List<TeacherDTO> getAllTeachers() {
        return service.getAllTeachers();
    }

    @PutMapping("/update_teacher/{id}")
    public Teacher updateStudent(@PathVariable("id") Long teacherId , @RequestBody TeacherUpdateDTO teacherUpdateDTO) {
        return service.updateStudent(teacherId ,teacherUpdateDTO);
    }
    @DeleteMapping("/delete_teacher/{id}")
    public String  deleteStudent(@PathVariable(value = "id") long id) {
        service.deleteTeacher(id);
        return "Teacher deleted successfully";
    }
}
