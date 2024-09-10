package com.jheezy.studentmanagementapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BatchSaveDTO {

    private long batchId;

    private String batchName;

    private long courseId;

    private String startDate;
}
