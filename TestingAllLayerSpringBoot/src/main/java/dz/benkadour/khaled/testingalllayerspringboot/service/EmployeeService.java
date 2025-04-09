package dz.benkadour.khaled.testingalllayerspringboot.service;

import dz.benkadour.khaled.testingalllayerspringboot.exception.ResourceNotFoundException;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import dz.benkadour.khaled.testingalllayerspringboot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
public interface EmployeeService {

    Employee saveEmployee(Employee employee) throws ResourceNotFoundException;
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee updatedEmployee) throws ResourceNotFoundException;
    void deleteEmployee(Long idEmployee);
}
