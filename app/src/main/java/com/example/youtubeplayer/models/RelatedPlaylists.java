
package com.example.youtubeplayer.models;


public class RelatedPlaylists {

    private String uploads;
    private String watchHistory;
    private String watchLater;

    public RelatedPlaylists() {
    }

    public RelatedPlaylists(String uploads, String watchHistory, String watchLater) {
        super();
        this.uploads = uploads;
        this.watchHistory = watchHistory;
        this.watchLater = watchLater;
    }

    public String getUploads() {
        return uploads;
    }

    public void setUploads(String uploads) {
        this.uploads = uploads;
    }

    public String getWatchHistory() {
        return watchHistory;
    }

    public void setWatchHistory(String watchHistory) {
        this.watchHistory = watchHistory;
    }

    public String getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(String watchLater) {
        this.watchLater = watchLater;
    }

}
