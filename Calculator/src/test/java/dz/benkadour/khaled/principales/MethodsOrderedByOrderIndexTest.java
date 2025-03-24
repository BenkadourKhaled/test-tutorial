package dz.benkadour.khaled.principales;
import org.junit.jupiter.api.*;
/**
 * Create By ${_} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (11:40)
 * @Project_Name : TESTING-LEARNING
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndexTest {

    StringBuilder completed = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println("The State Of instance object is : " + completed);
    }

    @Order(4)
    @Test
    void testA() {
        System.out.println("Running Test D");
        completed.append("4");
    }

    @Order(1)
    @Test
    void testB() {
        System.out.println("Running Test C");
        completed.append("1");
    }

    @Order(3)
    @Test
    void testC() {
        System.out.println("Running Test B");
        completed.append("3");
    }

    @Order(2)
    @Test
    void testD() {
        System.out.println("Running Test D");
        completed.append("2");
    }

}
