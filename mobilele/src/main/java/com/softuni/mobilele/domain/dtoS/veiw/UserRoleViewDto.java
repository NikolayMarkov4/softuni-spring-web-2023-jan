package com.softuni.mobilele.domain.dtoS.veiw;

import com.softuni.mobilele.domain.enums.Role;

public class UserRoleViewDto {
    private String role;

    public String getRole() {
        return role;
    }

    public UserRoleViewDto setRole(String role) {
        this.role = role;
        return this;
    }
}
