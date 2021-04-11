package com.YelpReviewAPI.demo.DAO;

public class User {
    private String id;
    private String profileUrl;
    private String imageUrl;
    private String name;

    public User(String id, String profileUrl, String imageUrl, String name) {
        this.id = id;
        this.profileUrl = profileUrl;
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
