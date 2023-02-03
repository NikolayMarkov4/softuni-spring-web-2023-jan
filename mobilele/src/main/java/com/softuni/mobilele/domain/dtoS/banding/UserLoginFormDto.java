package com.softuni.mobilele.domain.dtoS.banding;

public class UserLoginFormDto {
    private String username; // –  username of the user.
    private String password; //– password of the user.

    public UserLoginFormDto() {
    }

    public String getUsername() {
        return username;
    }

    public UserLoginFormDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLoginFormDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
