
package com.example.youtubeplayer.models;


public class High {

    private String url;
    private Integer width;
    private Integer height;

    public High() {
    }

    public High(String url, Integer width, Integer height) {
        super();
        this.url = url;
        this.width = width;
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

}
