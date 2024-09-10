package com.jheezy.studentmanagementapp.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BatchDTO {

    private long batchId;

    private String batchName;

    private long courseId;

    private String startDate;

}
