package dz.benkadour.khaled.principales;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (11:34)
 * @Project_Name : TESTING-LEARNING
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodsOrderedByNameTest {

    @Test
    void testA() {
        System.out.println("Running Test D");
    }

    @Test
    void testB() {
        System.out.println("Running Test C");
    }

    @Test
    void testC() {
        System.out.println("Running Test B");
    }

    @Test
    void testD() {
        System.out.println("Running Test A");
    }

}
