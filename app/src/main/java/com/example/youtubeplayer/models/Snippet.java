
package com.example.youtubeplayer.models;


public class Snippet {

    private String title;
    private String description;
    private String customUrl;
    private String publishedAt;
    private Thumbnails thumbnails;
    private Localized localized;
    private String country;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snippet() {
    }

    /**
     * 
     * @param customUrl
     * @param country
     * @param publishedAt
     * @param localized
     * @param description
     * @param title
     * @param thumbnails
     */
    public Snippet(String title, String description, String customUrl, String publishedAt, Thumbnails thumbnails, Localized localized, String country) {
        super();
        this.title = title;
        this.description = description;
        this.customUrl = customUrl;
        this.publishedAt = publishedAt;
        this.thumbnails = thumbnails;
        this.localized = localized;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    public Localized getLocalized() {
        return localized;
    }

    public void setLocalized(Localized localized) {
        this.localized = localized;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
