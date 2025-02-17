package com.wipro.sprintboot.usecase1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    // Add or update employee
    public Employee addOrUpdateEmployee(Employee employee) {
        // Set default designation as "Developer" for new employees
        if (employee.getDesignation() == null || employee.getDesignation().isEmpty()) {
            employee.setDesignation("Developer");
        }

        // Save or update employee data
        return employeeRepository.save(employee);
    }

    // Find an employee by ID
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Update employee designation
    public Employee updateEmployeeDesignation(Long id, String designation) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setDesignation(designation);
            return employeeRepository.save(employee);
        }
        return null;
    }
    
 // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
