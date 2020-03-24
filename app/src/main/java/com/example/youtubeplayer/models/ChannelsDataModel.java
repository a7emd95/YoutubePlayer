
package com.example.youtubeplayer.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChannelsDataModel {

    private String kind;
    private String etag;
    private PageInfo pageInfo;
    @SerializedName("items")
    private List<Item> items ;

    public ChannelsDataModel() {
    }
    public ChannelsDataModel(String kind, String etag, PageInfo pageInfo, List<Item> items) {
        super();
        this.kind = kind;
        this.etag = etag;
        this.pageInfo = pageInfo;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }
    public String getEtag() {
        return etag;
    }
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public List<Item> getItems() {
        return items;
    }



}
