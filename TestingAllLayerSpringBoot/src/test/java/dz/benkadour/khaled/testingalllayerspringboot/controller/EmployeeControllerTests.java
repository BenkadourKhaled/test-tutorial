package dz.benkadour.khaled.testingalllayerspringboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dz.benkadour.khaled.testingalllayerspringboot.exception.ResourceNotFoundException;
import dz.benkadour.khaled.testingalllayerspringboot.model.Employee;
import dz.benkadour.khaled.testingalllayerspringboot.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (09/04/2025)
 * @TIME : (14:33)
 * @Project_Name : TESTING-LEARNING
 */
@WebMvcTest
public class EmployeeControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void givenEmployeeObject_whenCreateEmployee_thenReturnSaveEmployee() throws ResourceNotFoundException {

        // Given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("BENKADOUR")
                .lastName("KHALED")
                .email("BENKKADOUR.KHALED@GMAIL.COM")
                .build();
        BDDMockito.given(employeeService.saveEmployee(ArgumentMatchers.any(Employee.class)));
        // When - actin or behavior that we are going test
        // Then - Verify the result or output using assert statements

    }

}
