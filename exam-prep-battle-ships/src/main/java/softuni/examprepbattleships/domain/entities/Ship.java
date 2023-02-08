package softuni.examprepbattleships.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "ships")
public class Ship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
    //    o	The length of the values must be between 2 and 10 characters (both numbers are INCLUSIVE)
    //    o	The values should be unique in the database

    @Column(nullable = false)
    private Long health;
    //    o	The values should be positive numbers

    @Column(nullable = false)
    private Long power;
    //    o	The values should be positive numbers

    @Column(nullable = false)
    private Date created;
    //    o	The values should not be future dates

    @ManyToOne
    private Category category;
    //    o	A relationship with the Categories Entity

    @ManyToOne
    private User user;
    //    o	A user that owns the ship


    @Override
    public String toString() {
        String s = "| %s | %s | %s |";
        return String.format(s, name, health, power);

    }
}
