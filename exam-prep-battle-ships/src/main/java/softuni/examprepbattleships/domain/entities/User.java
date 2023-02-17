package softuni.examprepbattleships.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    //    – Accepts UUID-String or Long values
    @Column(unique = true, nullable = false)
    private String username;
    //    The length of the values should be between 3 and 10 characters long (both numbers are INCLUSIVE)
    //    The values should be unique in the database
    @Column(nullable = false)
    private String fullName;
    //    The length of the values should be between 5 and 20 characters long (both numbers are INCLUSIVE)
    @Column(nullable = false)
    private String password;
    //    The length of the values should be more than 3 characters long (INCLUSIVE)
    @Column(unique = true, nullable = false)
    private String email;
    //    The values should contain a '@' symbol
    //    The values should be unique in the database

}
