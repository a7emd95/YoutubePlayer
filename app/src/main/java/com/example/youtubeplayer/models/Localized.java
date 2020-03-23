
package com.example.youtubeplayer.models;


public class Localized {

    private String title;
    private String description;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Localized() {
    }

    /**
     * 
     * @param description
     * @param title
     */
    public Localized(String title, String description) {
        super();
        this.title = title;
        this.description = description;
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

}
