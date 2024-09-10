package com.jheezy.studentmanagementapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    @Id
    @Column(name = "teacher_id", length = 100)
    private long teacherId;

    @Column(name = "teacher_name", length = 150)
    private String teacherName;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;


}
