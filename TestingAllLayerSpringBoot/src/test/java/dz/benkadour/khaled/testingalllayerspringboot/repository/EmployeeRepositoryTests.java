package dz.benkadour.khaled.testingalllayerspringboot.repository;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (25/03/2025)
 * @TIME : (10:23)
 * @Project_Name : TESTING-LEARNING
 */

@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    // JUnit test for save employee operation
    @DisplayName("SAVE EMPLOYEE")
    @Test
    public void givenEmployeeObject_whenSave_thenReturnSavedEmployeeObject() {
        // Given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("khaled")
                .lastName("BENKADOUR")
                .email("BENKKADOUR.KHALED@gmail.com")
                .build();
        // When - action or the behaviour that we are going test
        Employee savedEmployee = employeeRepository.save(employee);
        //Then - verify the output
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    // JUnit test for
    @DisplayName("Get All Employees")
    @Test
    public void givenListEmployees_whenGetAllEmployees_thenReturnEmployeeList() {
        // Given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("khaled")
                .lastName("BENKADOUR")
                .email("BENKKADOUR.KHALED@gmail.com")
                .build();

        Employee employee1 = Employee.builder()
                .firstName("BAKI")
                .lastName("CHAIBI")
                .email("BAKI.CHAIBI@gmail.com")
                .build();
        employeeRepository.save(employee);
        employeeRepository.save(employee1);

        // When - action or the behaviour that we are going test

        List<Employee> employees = employeeRepository.findAll();
        assertThat(employees).isNotNull();
        assertThat(employees.size()).isEqualTo(2);
    }

    @DisplayName("Get Employee By ID")
    @Test
    public void givenEmployeeObject_whenFindById_thenReturnEmployeeObject() {
        // Given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("khaled")
                .lastName("BENKADOUR")
                .email("BENKKADOUR.KHALED@gmail.com")
                .build();
        employeeRepository.save(employee);
        // When - action or the behavior that we are going test
        Employee find = employeeRepository.findById(employee.getId()).get();
        // Then - verify the output
        assertThat(find.getId()).isNotNull();
        assertThat(find.getId()).isGreaterThan(0);
    }

    @Test
    @DisplayName("Find Employee By Email")
    public void givenEmployeeEmail_whenFindByEmail_thenReturnEmployeeObject() {
        // Given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("khaled")
                .lastName("BENKADOUR")
                .email("BENKKADOUR.KHALED@gmail.com")
                .build();
        employeeRepository.save(employee);
        // When - action or the behavior that we are going test
        Employee employeeDb = employeeRepository.findByEmail(employee.getEmail()).get();
        // Then - verify the output
        assertThat(employeeDb.getEmail()).isNotEmpty();

    }


}
