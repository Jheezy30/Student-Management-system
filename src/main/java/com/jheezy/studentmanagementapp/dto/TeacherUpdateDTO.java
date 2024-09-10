package com.jheezy.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherUpdateDTO {
    private long teacherId;

    private String teacherName;

    private String address;

    private String phoneNumber;
}
