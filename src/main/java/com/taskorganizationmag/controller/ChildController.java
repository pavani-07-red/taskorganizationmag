 package com.taskorganizationmag.controller;

import com.taskorganizationmag.entity.Child;
import com.taskorganizationmag.service.ChildService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/children")
@CrossOrigin(origins = "*") // allows frontend apps to call these APIs
public class ChildController {

    @Autowired
    private ChildService childService;

    @GetMapping
    public List<Child> getAllChildren() {
        return childService.getAllChildren();
    }

    @GetMapping("/{id}")
    public Optional<Child> getChildById(@PathVariable Long id) {
        return childService
        		.getChildById(id);
    }

    @PostMapping
    public Child createChild(@RequestBody Child child) {
        return childService.saveChild(child);
    }

    @PutMapping("/{id}")
    public Child updateChild(@PathVariable Long id, @RequestBody Child childDetails) {
        return childService.updateChild(id, childDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteChild(@PathVariable Long id) {
        childService.deleteChild(id);
    }
}

