package softuni.examprepbattleships.domain.model;

import lombok.*;
import softuni.examprepbattleships.domain.enums.CategoryType;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryModel {

    private Long id;

    private CategoryType name;

    private String description;

}