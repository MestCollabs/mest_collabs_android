package com.example.pianoafrik.mestcollabsapp;

public class Feeds {

    public String imageUrl, feedText, datePosted, timePosted, numberOfLikes, numberOfComments, postedBy;

    public Feeds(String imageUrl, String feedText, String datePosted, String timePosted, String numberOfLikes, String numberOfComments, String postedBy) {
        this.imageUrl = imageUrl;
        this.feedText = feedText;
        this.datePosted = datePosted;
        this.timePosted = timePosted;
        this.numberOfLikes = numberOfLikes;
        this.numberOfComments = numberOfComments;
        this.postedBy=postedBy;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getFeedText() {
        return feedText;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public String getTimePosted() {
        return timePosted;
    }

    public String getNumberOfLikes() {
        return numberOfLikes;
    }

    public String getNumberOfComments() {
        return numberOfComments;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setFeedText(String feedText) {
        this.feedText = feedText;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public void setTimePosted(String timePosted) {
        this.timePosted = timePosted;
    }

    public void setNumberOfLikes(String numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public void setNumberOfComments(String numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
}
