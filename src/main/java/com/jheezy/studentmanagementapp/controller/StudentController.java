package com.jheezy.studentmanagementapp.controller;

import com.jheezy.studentmanagementapp.dto.StudentDTO;
import com.jheezy.studentmanagementapp.dto.StudentSaveDTO;
import com.jheezy.studentmanagementapp.dto.StudentUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Student;
import com.jheezy.studentmanagementapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping("/add_student")
    public Student saveStudent(@RequestBody StudentSaveDTO studentSaveDTO) {
        return service.saveStudent(studentSaveDTO);
    }

    @GetMapping("/get_all_students")
    public List<StudentDTO> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/update_student")
    public Student updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO) {
        return service.updateStudent(studentUpdateDTO);
    }
    @DeleteMapping("/delete_student/{id}")
    public String  deleteStudent(@PathVariable(value = "id") long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }



}
