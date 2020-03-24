package com.example.youtubeplayer.services;

import com.example.youtubeplayer.models.ChannelsDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YoutubeApi {
    @GET("youtube/v3/channels")
    Call<ChannelsDataModel> getChannels(
            @Query("part") String part,
            @Query("id") String channelId,
            @Query("key") String apiKey
    );
}
