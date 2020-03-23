package com.example.youtubeplayer.repository;

import com.example.youtubeplayer.models.ChannelsDataModel;

public interface YoutubeChannelCallBack {
    void onSuccess(ChannelsDataModel channelsDataModel);

    void onFailed(Throwable t);
}
