package dz.benkadour.khaled;
import dz.benkadour.khaled.model.User;
import dz.benkadour.khaled.service.UserService;
import dz.benkadour.khaled.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (14:18)
 * @Project_Name : TESTING-LEARNING
 */

public class UserServiceTest {

    @DisplayName("User Object Created")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnUserObject() throws IllegalAccessException {

        // Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";
        String password = "password";
        String repeatPassword = "repeatPassword";
        // Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);
        System.out.println(user.getId());
        // Assert
        assertNotNull(user, "The createUser() should not have returned a null user");
        assertEquals(firstName, user.getFirstName(), "User's first name Is Incorrect");
        assertEquals(lastName, user.getLastName(), "The last name Is Incorrect");
        assertEquals(email, user.getEmail(), "The Email should Is Incorrect");
        assertNotNull(user.getId(), "User ID is messing");
    }


    @DisplayName("Empty first name causes correct exception")
    @Test
    void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException() {
        // Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";
        String password = "password";
        String repeatPassword = "repeatPassword";
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            userService.createUser(firstName, lastName, email, password, repeatPassword);
        }, "Empty first name should have caused an illegal argument Exception");
    }


}
