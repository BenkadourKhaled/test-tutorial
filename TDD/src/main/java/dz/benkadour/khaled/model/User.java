package dz.benkadour.khaled.model;

import java.util.UUID;

/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (24/03/2025)
 * @TIME : (09:36)
 * @Project_Name : TESTING-LEARNING
 */
public class User {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String repeatPassword;

    public User() {}

    public User(UUID id, String firstName, String lastName, String email, String password, String repeatPassword) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
