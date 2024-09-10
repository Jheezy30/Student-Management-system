package com.jheezy.studentmanagementapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {

    private long studentId;

    private String studentName;

    private String address;

    private String phoneNumber;
}
