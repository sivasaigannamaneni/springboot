package com.wipro.sprintboot.usecase1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Endpoint to add or update an employee
    @PostMapping("/addOrUpdate")
    public Employee addOrUpdateEmployee(@RequestBody Employee employee) {
        return employeeService.addOrUpdateEmployee(employee);
    }

    // Endpoint to get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }

    // Endpoint to update the employee's designation
    @PutMapping("/updateDesignation/{id}")
    public Employee updateEmployeeDesignation(@PathVariable Long id, @RequestParam String designation) {
        return employeeService.updateEmployeeDesignation(id, designation);
    }
    
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
