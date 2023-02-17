package softuni.examprepbattleships.domain.model;

import lombok.*;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipModel {
    private Long id;
    private String name;
    private Long health;
    private Long power;
    private Date created;
    private CategoryModel category;
    private UserModel user;

}
