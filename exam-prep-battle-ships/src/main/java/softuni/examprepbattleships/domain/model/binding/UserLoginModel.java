package softuni.examprepbattleships.domain.model.binding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import softuni.examprepbattleships.validations.checkUserExistance.ValidateLoginForm;

@Setter
@Getter
@NoArgsConstructor
@ValidateLoginForm
public class UserLoginModel {
    private String username;
    private String password;
}
