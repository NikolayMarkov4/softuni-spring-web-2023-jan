package softuni.examprepbattleships.domain.model.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.examprepbattleships.domain.enums.CategoryType;
import softuni.examprepbattleships.validations.checkShipExistence.ValidateExistenceOfShip;

import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
public class ShipAddModel {
    @NotNull
    @Size(min = 2, max = 10)
    @ValidateExistenceOfShip
    private String name;

    @NotNull
    @Positive
    private Long health;

    @NotNull
    @Positive
    private Long power;

    @NotNull
    @PastOrPresent
    private Date created;

    @NotNull
    private CategoryType category;

}
