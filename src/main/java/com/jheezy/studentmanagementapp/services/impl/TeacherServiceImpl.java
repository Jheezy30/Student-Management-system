package com.jheezy.studentmanagementapp.services.impl;

import com.jheezy.studentmanagementapp.dto.TeacherDTO;
import com.jheezy.studentmanagementapp.dto.TeacherSaveDTO;
import com.jheezy.studentmanagementapp.dto.TeacherUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Teacher;
import com.jheezy.studentmanagementapp.repository.TeacherRepository;
import com.jheezy.studentmanagementapp.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.parser.Part;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    public Teacher saveTeacher(TeacherSaveDTO teacherSaveDTO) {
        Teacher teacher = new Teacher(
                teacherSaveDTO.getTeacherId(),
                teacherSaveDTO.getTeacherName(),
                teacherSaveDTO.getAddress(),
                teacherSaveDTO.getPhoneNumber()
        );
        return teacherRepository.save(teacher);
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return teacherRepository.findAll().stream()
                .map(teacher -> new TeacherDTO(
                        teacher.getTeacherId(),
                        teacher.getTeacherName(),
                        teacher.getAddress(),
                        teacher.getPhoneNumber()

                )).collect(Collectors.toList());
    }

    @Override
    public Teacher updateStudent(Long teacherId, TeacherUpdateDTO teacherUpdateDTO) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        if (Objects.nonNull(teacherUpdateDTO.getTeacherId())) {
            teacher.setTeacherId(teacherUpdateDTO.getTeacherId());
        }

        if (Objects.nonNull(teacherUpdateDTO.getTeacherName()) && !"".equalsIgnoreCase(teacherUpdateDTO.getTeacherName())) {
            teacher.setTeacherName(teacherUpdateDTO.getTeacherName());
        }

        if (Objects.nonNull(teacherUpdateDTO.getAddress()) && !"".equalsIgnoreCase(teacherUpdateDTO.getAddress())) {
            teacher.setAddress(teacherUpdateDTO.getAddress());
        }

        if (Objects.nonNull(teacherUpdateDTO.getPhoneNumber()) && !"".equalsIgnoreCase(teacherUpdateDTO.getPhoneNumber())) {
            teacher.setPhoneNumber(teacherUpdateDTO.getPhoneNumber());
        }
        return teacherRepository.save(teacher);

    }

    @Override
    public void deleteTeacher(long id) {
        teacherRepository.deleteById(id);
    }
}
