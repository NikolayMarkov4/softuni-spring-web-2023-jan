package softuni.examprepbattleships.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserModel {
    private Long Id;
    private String username;
    private String fullName;
    private String password;
    private String email;
}