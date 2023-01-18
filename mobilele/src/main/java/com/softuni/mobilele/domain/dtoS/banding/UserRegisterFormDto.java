package com.softuni.mobilele.domain.dtoS.banding;

import jakarta.persistence.Column;

public class UserRegisterFormDto {

    private String username; // –  username of the user.

    private String password; //– password of the user.

    private String firstName; //–  first name of the user.

    private String lastName; //–  last name of the user.

    private String role; //–  last name of the user.

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

    public String getRole() {
        return role;
    }

    public UserRegisterFormDto setRole(String role) {
        this.role = role;
        return this;
    }
}
