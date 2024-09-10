package com.jheezy.studentmanagementapp.services;

import com.jheezy.studentmanagementapp.dto.BatchDTO;
import com.jheezy.studentmanagementapp.dto.BatchSaveDTO;
import com.jheezy.studentmanagementapp.dto.BatchUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Batch;

import java.util.List;

public interface BatchService {
    Batch saveBatch(BatchSaveDTO batchSaveDTO);

    List<BatchDTO> getAllBatches();

    Batch updateBatch(long batchId, BatchUpdateDTO batchUpdateDTO);

    void deleteBatch(long batchId);
}
