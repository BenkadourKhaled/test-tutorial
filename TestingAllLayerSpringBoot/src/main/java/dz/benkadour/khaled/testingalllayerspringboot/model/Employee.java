package dz.benkadour.khaled.testingalllayerspringboot.model;

import jakarta.persistence.*;
import lombok.*;


/**
 * Create By ${} on 31/10/2024
 *
 * @Author : KHALED_BENKADOUR
 * @Email : BENKKADOUR.KHALED@GMAIL.COM
 * @DATE : (24/03/2025)
 * @TIME : (14:58)
 * @Project_Name : TESTING-LEARNING
 */
@Setter @Getter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
@Entity @Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;

}
