 package com.taskorganizationmag.service;

import com.taskorganizationmag.entity.Child;
import com.taskorganizationmag.repository.ChildRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildService {

    @Autowired
    private ChildRepository childRepository;

    // Get all children
    public List<Child> getAllChildren() {
        return childRepository.findAll();
    }

    // Get a single child by ID
    public Optional<Child> getChildById(Long id) {
        return childRepository.findById(id);
    }

    // Save new child
    public Child saveChild(Child child) {
        return childRepository.save(child);
    }

    // Update existing child
    public Child updateChild(Long id, Child childDetails) {
        Child child = childRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Child not found with id: " + id));

        child.setName(childDetails.getName());
        child.setAge(childDetails.getAge());
        child.setGrade(childDetails.getGrade());

        return childRepository.save(child);
    }

    // Delete a child
    public void deleteChild(Long id) {
        childRepository.deleteById(id);
    }
}


