package softuni.examprepbattleships.domain.helpers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoggedUser {

    private Long id;

    public boolean isEmpty() {
        return this.id == null;
    }

    public void clearUser() {
        this.id = null;
    }
}
