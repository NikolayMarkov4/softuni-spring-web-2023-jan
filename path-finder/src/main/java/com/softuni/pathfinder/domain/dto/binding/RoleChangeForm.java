package com.softuni.pathfinder.domain.dto.binding;

public class RoleChangeForm {

    private String roleName;

    public RoleChangeForm() {
    }

    public String getRoleName() {
        return roleName;
    }

    public RoleChangeForm setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
}
