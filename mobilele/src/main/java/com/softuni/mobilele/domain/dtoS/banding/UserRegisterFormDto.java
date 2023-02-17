package com.softuni.mobilele.domain.dtoS.banding;

import com.softuni.mobilele.domain.enums.Role;

public class UserRegisterFormDto {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;

    public String getUsername() {
        return username;
    }

    public UserRegisterFormDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterFormDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterFormDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterFormDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public UserRegisterFormDto setRole(Role role) {
        this.role = role;
        return this;
    }
}
