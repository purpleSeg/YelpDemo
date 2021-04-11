package com.YelpReviewAPI.demo.DAO;

public class Review {
    private String id;
    private int rating;
    private User user;
    private String text;
    private String timeCreated;
    private String reviewUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getReviewUrl() {
        return reviewUrl;
    }

    public void setReviewUrl(String reviewUrl) {
        this.reviewUrl = reviewUrl;
    }

    public Review(String id, int rating, User user, String text, String timeCreated, String reviewUrl) {
        this.id = id;
        this.rating = rating;
        this.user = user;
        this.text = text;
        this.timeCreated = timeCreated;
        this.reviewUrl = reviewUrl;
    }
}
