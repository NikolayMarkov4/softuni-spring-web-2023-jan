package com.softuni.pathfinder.domain.dto.view;

import com.softuni.pathfinder.domain.enums.Level;

public class UserProfileModel {
    private String username;
    private String fullName;
    private Integer age;
    private Level level;

    public UserProfileModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
