package dz.benkadour.khaled.principales;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (11:40)
 * @Project_Name : TESTING-LEARNING
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndexTest {

    @Order(4)
    @Test
    void testA() {
        System.out.println("Running Test D");
    }

    @Order(1)
    @Test
    void testB() {
        System.out.println("Running Test C");
    }

    @Order(3)
    @Test
    void testC() {
        System.out.println("Running Test B");
    }

    @Order(2)
    @Test
    void testD() {
        System.out.println("Running Test A");
    }

}
