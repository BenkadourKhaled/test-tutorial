package dz.benkadour.khaled.service;

import dz.benkadour.khaled.model.User;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : 31/10/2024
 * @TIME : 08:59
 * @Project_Name : inventory-management-system
 */
public interface UserService {

    User createUser(String firstName, String lastName, String email, String password, String repeatPassword) throws IllegalAccessException;
}
