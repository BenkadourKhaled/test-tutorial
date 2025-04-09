package dz.benkadour.khaled.testingalllayerspringboot.service.impl;

import dz.benkadour.khaled.testingalllayerspringboot.exception.ResourceNotFoundException;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import dz.benkadour.khaled.testingalllayerspringboot.repository.EmployeeRepository;
import dz.benkadour.khaled.testingalllayerspringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (06/04/2025)
 * @TIME : (09:23)
 * @Project_Name : TESTING-LEARNING
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) throws ResourceNotFoundException {
        Optional<Employee> savedEmployee = employeeRepository.findByEmail(employee.getEmail());
        if (savedEmployee.isPresent()){
            throw new ResourceNotFoundException("Employee already exists with given email" + employee.getEmail());
        }
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee updatedEmployee) throws ResourceNotFoundException {

        return employeeRepository.save(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long idEmployee) {
        employeeRepository.deleteById(idEmployee);
    }
}
