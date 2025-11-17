 package com.taskorganizationmag.repository;

import com.taskorganizationmag.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Custom query example:
    // List<Teacher> findBySubject(String subject);
}


