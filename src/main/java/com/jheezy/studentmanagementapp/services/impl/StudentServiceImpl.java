package com.jheezy.studentmanagementapp.services.impl;

import com.jheezy.studentmanagementapp.dto.StudentDTO;
import com.jheezy.studentmanagementapp.dto.StudentSaveDTO;
import com.jheezy.studentmanagementapp.dto.StudentUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Student;
import com.jheezy.studentmanagementapp.repository.StudentRepository;
import com.jheezy.studentmanagementapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(StudentSaveDTO studentSaveDTO) {
        Student student = new Student(
                studentSaveDTO.getStudentId(),
                studentSaveDTO.getStudentName(),
                studentSaveDTO.getAddress(),
                studentSaveDTO.getPhoneNumber()

        );
        return studentRepository.save(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(student -> new StudentDTO(
                        student.getStudentId(),
                        student.getStudentName(),
                        student.getAddress(),
                        student.getPhoneNumber()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public Student updateStudent(StudentUpdateDTO studentUpdateDTO) {
        if (studentRepository.existsById(studentUpdateDTO.getStudentId())) {
            Student student = studentRepository.findById(studentUpdateDTO.getStudentId()).get();
            student.setStudentName(studentUpdateDTO.getStudentName());
            student.setAddress(studentUpdateDTO.getAddress());
            student.setPhoneNumber(studentUpdateDTO.getPhoneNumber());
            return studentRepository.save(student);
        }
        return null;
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

}