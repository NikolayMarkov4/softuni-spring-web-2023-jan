package softuni.examprepbattleships.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import softuni.examprepbattleships.domain.enums.CategoryType;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(unique = true, nullable = false)
    private CategoryType name;
    //    o	An option between BATTLE, CARGO, PATROL
    //    o	The values should be unique in the database

    @Column(columnDefinition = "TEXT")
    private String description;
    //    o	A very long and detailed description of the category
    //    o	Can accept null values

}
