
package com.example.youtubeplayer.models;


public class ContentDetails {

    private RelatedPlaylists relatedPlaylists;


    public ContentDetails(RelatedPlaylists relatedPlaylists) {
        super();
        this.relatedPlaylists = relatedPlaylists;
    }

    public RelatedPlaylists getRelatedPlaylists() {
        return relatedPlaylists;
    }

    public void setRelatedPlaylists(RelatedPlaylists relatedPlaylists) {
        this.relatedPlaylists = relatedPlaylists;
    }

}
