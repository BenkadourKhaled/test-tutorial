package dz.benkadour.khaled.service;

import dz.benkadour.khaled.model.User;

import java.util.UUID;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (23/03/2025)
 * @TIME : (15:03)
 * @Project_Name : TESTING-LEARNING
 */
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) throws IllegalAccessException {
        if (firstName == null || firstName.trim().length() == 0) {
            throw new IllegalAccessException("User's first name is empty");
        }
        return new User(UUID.randomUUID(), firstName, lastName, email, password, repeatPassword);
    }
}
