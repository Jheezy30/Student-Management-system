package com.jheezy.studentmanagementapp.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id", length = 100)
    private long studentId;

    @Column(name = "student_name", length = 150)
    private String studentName;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;
}
