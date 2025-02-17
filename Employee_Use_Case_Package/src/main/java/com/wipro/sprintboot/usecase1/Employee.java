package com.wipro.sprintboot.usecase1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
    private Long id;
    private String name;
    private String designation;

    // Default constructor
    public Employee() {}

    // Constructor with parameters
    public Employee(Long id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
