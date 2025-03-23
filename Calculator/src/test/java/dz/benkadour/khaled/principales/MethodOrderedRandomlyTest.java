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
 * @TIME : (11:31)
 * @Project_Name : TESTING-LEARNING
 */

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandomlyTest {

    @Test
    void testA() {
        System.out.println("Running Test A");
    }

    @Test
    void testB() {
        System.out.println("Running Test B");
    }

    @Test
    void testC() {
        System.out.println("Running Test C");
    }

    @Test
    void testD() {
        System.out.println("Running Test D");
    }


}
