package dz.benkadour.khaled;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations In Calculator Class")
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Executing @BeforeAll Method");
    }

    @AfterAll
    static void cleanUpAfterClass() throws Exception {
        System.out.println("Executing @AfterAll Method");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Executing @BeforeEach Method");
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executing @AfterEach Method");
    }


    @Test
    @DisplayName("Integer Division")
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        //Arrange   // Given
        int dividend = 4;
        int divisor = 2;
        int expectedResult = 2;
        // Act      // When
        int actualResult = calculator.integerDivision(dividend, divisor);
        // Assert   //Then
        assertEquals(expectedResult, actualResult, "4/2 did not produce 2");
    }

    @Test
    @DisplayName("Division By Zero")
    @Disabled("TODO : Still Need To Work On It")
    void testIntegerSubtraction_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running Division By Zero");
        fail("Not Implemented yet");
    }

    @Test
    @DisplayName("Integer Subtraction")
    void TestIntegerSubtraction() {
        int a = 10;
        int b = 5;
        int expectedResult = 5;
        int actualResult = calculator.subtraction(a, b);
        assertEquals(expectedResult, actualResult, a + " - " + b + "did not produce : " + expectedResult);
    }

}