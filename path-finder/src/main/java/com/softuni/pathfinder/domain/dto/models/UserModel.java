package com.softuni.pathfinder.domain.dto.models;

import com.softuni.pathfinder.domain.enums.Level;
import jakarta.persistence.*;

import java.util.Set;

public class UserModel {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Set<RoleModel> roles;
    private Level level;
    private String fullName;
    private Integer age;

    public UserModel() {
    }

    public Long getId() {
        return id;
    }

    public UserModel setId(Long id) {
        this.id = id;
        return this;
    }

    public Set<RoleModel> getRoles() {
        return roles;
    }

    public UserModel setRoles(Set<RoleModel> roles) {
        this.roles = roles;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserModel setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<RoleModel> getRole() {
        return roles;
    }

    public UserModel setRole(Set<RoleModel> roles) {
        this.roles = roles;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public UserModel setLevel(Level level) {
        this.level = level;
        return this;
    }

    public boolean isValid() {
        return this.id != null;
    }
}
