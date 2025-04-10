package dz.benkadour.khaled.testingalllayerspringboot.controller;

import dz.benkadour.khaled.testingalllayerspringboot.exception.ResourceNotFoundException;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import dz.benkadour.khaled.testingalllayerspringboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (09/04/2025)
 * @TIME : (13:56)
 * @Project_Name : TESTING-LEARNING
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) throws ResourceNotFoundException {
        return employeeService.saveEmployee(employee);
    }





}
