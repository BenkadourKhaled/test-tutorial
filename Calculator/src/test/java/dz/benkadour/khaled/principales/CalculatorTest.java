package dz.benkadour.khaled.principales;
import dz.benkadour.khaled.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    //@Disabled("TODO : Still Need To Work On It")

    @Test
    @DisplayName("Division By Zero")
    void testIntegerSubtraction_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running Division By Zero");
        // Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ By Zero ";
        // Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            // Act
            calculator.integerDivision(dividend, divisor);
        }, "Division By Zero should throw Arithmetic Exception");
        // Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(), " Unexpected exception message");
    }

    @DisplayName("Test Integer Subtraction [minuend, subtrahend, expectedResult]")
    //@Test
    @ParameterizedTest
    //@MethodSource()
    @CsvSource({"33, 1, 32", "24, 1, 23", "54, 1, 53"})
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        int actualResult = calculator.subtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, minuend + " - " + subtrahend + "did not produce : " + expectedResult);
    }

    /*public static Stream<Arguments> integerSubtraction() {
        return Stream.of(
                Arguments.of(33, 1, 32),
                Arguments.of(54, 1, 53),
                Arguments.of(24, 1, 23)
        );
    }
    */

}