package com.softuni.pathfinder.helpers;

import com.softuni.pathfinder.domain.dto.models.RoleModel;
import com.softuni.pathfinder.domain.enums.RoleName;

import java.util.Set;

public class LoggedUser {
    private Long id;
    private String username;
    private Set<RoleModel> roleModels;


    public LoggedUser() {
    }

    public Long getId() {
        return id;
    }

    public LoggedUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public LoggedUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public Set<RoleModel> getRoleModels() {
        return roleModels;
    }

    public LoggedUser setRoleModels(Set<RoleModel> roleModels) {
        this.roleModels = roleModels;
        return this;
    }

    public void clearFields() {
        this.id = null;
        this.username = null;
        this.roleModels = null;
    }

    public Boolean isAdmin() {
        return roleModels.stream().anyMatch(roleModel -> roleModel.getRole().equals(RoleName.ADMIN));
    }
}
