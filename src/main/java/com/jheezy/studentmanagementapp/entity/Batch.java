package com.jheezy.studentmanagementapp.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "Batch")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id", length = 100)
    private long batchId;

    @Column(name = "batch_name", length = 150)
    private String batchName;

    @Column(name = "start_date", length = 150)
    private String startDate;

//    @ManyToOne
//    @JoinColumn(name = "course_id", nullable = false)
//    private Course course;
}
