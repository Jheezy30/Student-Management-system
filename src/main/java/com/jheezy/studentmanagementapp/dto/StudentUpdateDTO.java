package com.jheezy.studentmanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentUpdateDTO {
    private long studentId;

    private String studentName;

    private String address;

    private String phoneNumber;
}
