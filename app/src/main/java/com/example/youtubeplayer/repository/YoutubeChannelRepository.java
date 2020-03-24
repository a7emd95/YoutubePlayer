package com.example.youtubeplayer.repository;

import com.example.youtubeplayer.models.ChannelsDataModel;
import com.example.youtubeplayer.services.YoutubeApi;
import com.example.youtubeplayer.utlites.ChannelsIds;
import com.example.youtubeplayer.utlites.Constants;
import com.example.youtubeplayer.utlites.YoutubeKeyApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class YoutubeChannelRepository {
    YoutubeChannelCallBack youtubeChannelCallBack;
    Retrofit retrofit;
    YoutubeApi youtubeApi;

    public YoutubeChannelRepository(YoutubeChannelCallBack youtubeChannelCallBack) {
        this.youtubeChannelCallBack = youtubeChannelCallBack;
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        youtubeApi = retrofit.create(YoutubeApi.class);
    }

    public void getChannels() {
        Call<ChannelsDataModel> youtubeApiResponse = youtubeApi.getChannels(Constants.PART,
                ChannelsIds.chnlist, YoutubeKeyApi.API);

        youtubeApiResponse.enqueue(new Callback<ChannelsDataModel>() {
            @Override
            public void onResponse(Call<ChannelsDataModel> call, Response<ChannelsDataModel> response) {
                youtubeChannelCallBack.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ChannelsDataModel> call, Throwable t) {
                youtubeChannelCallBack.onFailed(t);
            }
        });
    }
}
