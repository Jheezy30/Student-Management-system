package com.jheezy.studentmanagementapp.repository;

import com.jheezy.studentmanagementapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
