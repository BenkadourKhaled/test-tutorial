package dz.benkadour.khaled.testingalllayerspringboot.service;
import dz.benkadour.khaled.testingalllayerspringboot.exception.ResourceNotFoundException;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import dz.benkadour.khaled.testingalllayerspringboot.repository.EmployeeRepository;
import dz.benkadour.khaled.testingalllayerspringboot.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (06/04/2025)
 * @TIME : (09:52)
 * @Project_Name : TESTING-LEARNING
 */
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {

    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @BeforeEach
    public void setUp() {
        //employeeRepository = Mockito.mock(EmployeeRepository.class);
        //employeeService = new EmployeeServiceImpl(employeeRepository);
        employee = Employee.builder()
                .id(1L)
                .firstName("BENKADOUR")
                .lastName("KHALED")
                .email("BENKKADOUR.KHALED@GMAIL.COM")
                .build();
    }

    @Test
    @DisplayName("JUnit test for saving Employee Method")
    public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() throws ResourceNotFoundException {
        // Given - precondition or setup


        given(employeeRepository.findByEmail(employee.getEmail())).willReturn(Optional.empty());
        given(employeeRepository.save(employee)).willReturn(employee);
        System.out.println(employeeRepository);
        System.out.println(employeeService);
        // When - action or the behavior that we are going test
        Employee savedEmployee = employeeService.saveEmployee(employee);
        System.out.println(savedEmployee.toString() );
        // Then - verify the output
        assertThat(savedEmployee).isNotNull();
    }

    @Test
    @DisplayName("JUnit test for saving Employee Method")
    public void givenExistingEmail_whenSaveEmployee_thenThrowsException() throws ResourceNotFoundException {
        // Given - precondition or setup

        given(employeeRepository.findByEmail(employee.getEmail())).willReturn(Optional.of(employee));
        //given(employeeRepository.save(employee)).willReturn(employee);
        System.out.println(employeeRepository);
        System.out.println(employeeService);
        // When - action or the behavior that we are going test
        Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            employeeService.saveEmployee(employee);
        });
        //Employee savedEmployee = employeeService.saveEmployee(employee);
        //System.out.println(savedEmployee.toString() );
        //assertThat(savedEmployee).isNotNull();
        // Then - verify the output
        verify(employeeRepository, never()).save(any(Employee.class));
    }

    @Test
    @DisplayName("JUnit test for Get All Employees Method")
    public void givenEmployeeList_whenGetAllEmployees_whenSaveEmployee_thenReturnEmployeeList() throws ResourceNotFoundException {
        // Given - precondition or setup
        Employee employee1 = Employee.builder()
                .id(2L)
                .firstName("BENKADOUR")
                .lastName("KHALED")
                .email("BENKKADOUR.KHALED@GMAIL.COM")
                .build();
        given(employeeRepository.findAll()).willReturn(List.of(employee, employee1));

        // When - action or the behavior that we are going test
        List<Employee> employeeList = employeeService.getAllEmployees();

        // Then - verify the output
        assertThat(employeeList).isNotNull();
    }


    @DisplayName("JUnit test for getEmployeeById method")
    @Test
    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployee() throws ResourceNotFoundException {
        // Given
        given(employeeRepository.findById(1L)).willReturn(Optional.of(employee));
        // When
        Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
        // Then
        assertThat(savedEmployee).isNotNull();
    }

    @DisplayName("JUnit test for updateEmployee Method")
    @Test
    public void giveEmployee_whenUpdateEmployee_thenReturnUpdatedEmployee() throws ResourceNotFoundException {
        // Given
        given(employeeRepository.save(employee)).willReturn(employee);
        employee.setEmail("KHALED.BENKADOUR.KHALED@GMAIL.COM");
        employee.setFirstName("KHALOUDA");
        employee.setLastName("BENKADOURA");
        // When
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        // Then
        assertThat(updatedEmployee).isNotNull();
        assertThat(updatedEmployee.getEmail()).isEqualTo("KHALED.BENKADOUR.KHALED@GMAIL.COM");
        assertThat(updatedEmployee.getFirstName()).isEqualTo("KHALOUDA");
        assertThat(updatedEmployee.getLastName()).isEqualTo("BENKADOURA");
    }

    @Test
    @DisplayName("JUnit test for deleteEmployee method")
    public void given_when_then() {
        // Given - precondition or setup
        long employeeId = 1L;
        willDoNothing().given(employeeRepository).deleteById(employeeId);
        // When - action or the behavior that we are going test
        employeeService.deleteEmployee(employeeId);
        // Then - Verify the output
        verify(employeeRepository, times(1)).deleteById(employeeId);
    }

















}
