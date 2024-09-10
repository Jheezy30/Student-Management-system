package com.jheezy.studentmanagementapp.services.impl;

import com.jheezy.studentmanagementapp.dto.BatchDTO;
import com.jheezy.studentmanagementapp.dto.BatchSaveDTO;
import com.jheezy.studentmanagementapp.dto.BatchUpdateDTO;
import com.jheezy.studentmanagementapp.entity.Batch;
import com.jheezy.studentmanagementapp.entity.Course;
import com.jheezy.studentmanagementapp.repository.BatchRepository;
import com.jheezy.studentmanagementapp.repository.CourseRepository;
import com.jheezy.studentmanagementapp.services.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BatchServiceImpl implements BatchService {
    @Autowired
    BatchRepository batchRepository;
    @Autowired
    CourseRepository courseRepository;


    @Override
//    public Batch saveBatch(BatchSaveDTO batchSaveDTO) {
//
//        Batch batch = new Batch(
//                batchSaveDTO.getBatchId(),
//                batchSaveDTO.getBatchName(),
//                batchSaveDTO.getStartDate(),
//                courseRepository.getById(batchSaveDTO.getCourseId())
//        );
//        return batchRepository.save(batch);
//    }

//    @Override
//    public List<BatchDTO> getAllBatches() {
//        return batchRepository.findAll().stream()
//                .map(batch -> new BatchDTO(
//                        batch.getBatchId(),
//                        batch.getBatchName(),
//                        batch.getCourse().getCourseId(),
//                        batch.getStartDate().toString()
//
//                )).collect(Collectors.toList());
//    }

    @Override
    public Batch updateBatch(long batchId, BatchUpdateDTO batchUpdateDTO) {
        Course course = courseRepository.getById(batchUpdateDTO.getCourseId());
        Batch batch = batchRepository.findById(batchId).get();
        String startDateString = batchUpdateDTO.getStartDate();
        LocalDate startDate = LocalDate.parse(startDateString);
        if (Objects.nonNull(batchUpdateDTO.getBatchId())) {
            batch.setBatchId(batchUpdateDTO.getBatchId());
        }
        if (Objects.nonNull(batchUpdateDTO.getBatchName()) && !"".equals(batchUpdateDTO.getBatchName())) {
            batch.setBatchName(batchUpdateDTO.getBatchName());
        }
        if (Objects.nonNull(batchUpdateDTO.getCourseId())) {
            batch.setCourse(course);
        }
        if (Objects.nonNull(batchUpdateDTO.getStartDate()) && !"".equals(batchUpdateDTO.getStartDate())) {
            batch.setStartDate(startDate.toString());
        }
        return batchRepository.save(batch);
    }

    @Override
    public void deleteBatch(long batchId) {
        batchRepository.deleteById(batchId);
    }


}
