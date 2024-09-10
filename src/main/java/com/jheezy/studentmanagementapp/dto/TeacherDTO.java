package com.jheezy.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

    private long teacherId;

    private String teacherName;

    private String address;

    private String phoneNumber;
}
