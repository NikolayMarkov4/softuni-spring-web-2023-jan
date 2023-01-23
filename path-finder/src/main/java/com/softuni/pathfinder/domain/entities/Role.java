package com.softuni.pathfinder.domain.entities;

import com.softuni.pathfinder.domain.enums.RoleName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private RoleName role;

    public Role() {
    }

    public RoleName getRole() {
        return role;
    }

    public Role setRole(RoleName role) {
        this.role = role;
        return this;
    }
}
