package com.taskorganizationmag.repository;
import com.taskorganizationmag.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
    // You can add custom queries if needed later, e.g.:
    // List<Child> findByGrade(String grade);
}

