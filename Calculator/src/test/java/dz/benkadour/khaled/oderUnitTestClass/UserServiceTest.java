package dz.benkadour.khaled.oderUnitTestClass;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (11:49)
 * @Project_Name : TESTING-LEARNING
 */
@Order(1)
public class UserServiceTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Test methods related To User");
    }

    @Test
    void testCreateUser_whenFirstNameIsMissing_throwsOrdersServiceException(){

    }
}
