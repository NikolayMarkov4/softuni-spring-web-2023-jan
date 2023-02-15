package com.softuni.pathfinder.domain.dto.models;

import com.softuni.pathfinder.domain.enums.Level;

import java.util.Set;

public class RouteModel {
    private Long id;
    private String gpxCoordinates;
    private Level level;
    private String name;
    private UserModel author;
    private String video;
    private String description;
    private Set<CommentModel> comments;
    private Set<PictureModel> pictures;
    private Set<CategoryModel> categories;

    public RouteModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<CommentModel> getComments() {
        return comments;
    }

    public void setComments(Set<CommentModel> comments) {
        this.comments = comments;
    }

    public Set<PictureModel> getPictures() {
        return pictures;
    }

    public void setPictures(Set<PictureModel> pictures) {
        this.pictures = pictures;
    }

    public Set<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryModel> categories) {
        this.categories = categories;
    }
}
