
package com.example.youtubeplayer.models;


public class Statistics {

    private String viewCount;
    private String commentCount;
    private String subscriberCount;
    private Boolean hiddenSubscriberCount;
    private String videoCount;

    public Statistics() {
    }

    public Statistics(String viewCount, String commentCount,
                      String subscriberCount, Boolean hiddenSubscriberCount,
                      String videoCount) {
        super();
        this.viewCount = viewCount;
        this.commentCount = commentCount;
        this.subscriberCount = subscriberCount;
        this.hiddenSubscriberCount = hiddenSubscriberCount;
        this.videoCount = videoCount;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public Boolean getHiddenSubscriberCount() {
        return hiddenSubscriberCount;
    }

    public void setHiddenSubscriberCount(Boolean hiddenSubscriberCount) {
        this.hiddenSubscriberCount = hiddenSubscriberCount;
    }

    public String getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(String videoCount) {
        this.videoCount = videoCount;
    }
}
