package com.jheezy.studentmanagementapp.controller;


import com.jheezy.studentmanagementapp.dto.BatchDTO;
import com.jheezy.studentmanagementapp.dto.BatchSaveDTO;
import com.jheezy.studentmanagementapp.dto.BatchUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Batch;
import com.jheezy.studentmanagementapp.services.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class BatchController {
    @Autowired
    private BatchService service;

    @PostMapping("/add_batch")
    public Batch saveBatch(@RequestBody BatchSaveDTO batchSaveDTO) {
        return service.saveBatch(batchSaveDTO);

    }

    @GetMapping("/get_all_batches")
    public List<BatchDTO> getAllBatches() {
        return service.getAllBatches();
    }

    @PutMapping("/update_batch/{batch_id}")
    public Batch updateBatch(@PathVariable("batch_id") long batchId, @RequestBody BatchUpdateDTO batchUpdateDTO) {
        return service.updateBatch(batchId, batchUpdateDTO);
    }

    @DeleteMapping("/delete_batch/{batch_id}")
    public String deleteBatch(@PathVariable("batch_id") long batchId) {
        service.deleteBatch(batchId);
        return "batch is deleted successfully";
    }


}
