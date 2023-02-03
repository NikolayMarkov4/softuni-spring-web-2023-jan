package com.softuni.pathfinder.domain.dto.models;

import com.softuni.pathfinder.domain.enums.RoleName;

public class RoleModel {

    private long id;
    private RoleName role;

    public RoleModel() {
    }

    public long getId() {
        return id;
    }

    public RoleModel setId(long id) {
        this.id = id;
        return this;
    }

    public RoleName getRole() {
        return role;
    }

    public RoleModel setRole(RoleName role) {
        this.role = role;
        return this;
    }
}
