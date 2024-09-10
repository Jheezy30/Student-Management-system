package com.jheezy.studentmanagementapp.services;

import com.jheezy.studentmanagementapp.dto.StudentDTO;
import com.jheezy.studentmanagementapp.dto.StudentSaveDTO;
import com.jheezy.studentmanagementapp.dto.StudentUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    Student saveStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    Student updateStudent(StudentUpdateDTO studentUpdateDTO);

    void deleteStudent(long id);
}
