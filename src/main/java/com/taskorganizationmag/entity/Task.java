package com.taskorganizationmag.entity;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskRole;
    private String status;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher assignedTeacher;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private Child assignedChild;

    public Task() {}

    public Task(String taskRole, String status, Teacher assignedTeacher, Child assignedChild) {
        this.taskRole = taskRole;
        this.status = status;
        this.assignedTeacher = assignedTeacher;
        this.assignedChild = assignedChild;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTaskRole() { return taskRole; }
    public void setTaskRole(String taskRole) { this.taskRole = taskRole; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Teacher getAssignedTeacher() { return assignedTeacher; }
    public void setAssignedTeacher(Teacher assignedTeacher) { this.assignedTeacher = assignedTeacher; }
    public Child getAssignedChild() { return assignedChild; }
    public void setAssignedChild(Child assignedChild) { this.assignedChild = assignedChild; }
}
