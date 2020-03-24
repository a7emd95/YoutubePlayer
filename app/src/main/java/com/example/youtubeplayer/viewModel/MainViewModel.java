package com.example.youtubeplayer.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youtubeplayer.models.ChannelsDataModel;
import com.example.youtubeplayer.repository.YoutubeChannelCallBack;
import com.example.youtubeplayer.repository.YoutubeChannelRepository;

public class MainViewModel extends ViewModel implements YoutubeChannelCallBack {
    private MutableLiveData<ChannelsDataModel> _channelMutablesLiveData =
            new MutableLiveData<>();
    public LiveData<ChannelsDataModel> channelsLiveData = _channelMutablesLiveData;
    YoutubeChannelRepository youtubeChannelRepository;

    public MainViewModel() {
        youtubeChannelRepository = new YoutubeChannelRepository(this);
    }

    public void getChannels() {
        youtubeChannelRepository.getChannels();
    }

    @Override
    public void onSuccess(ChannelsDataModel channelsDataModel) {
        _channelMutablesLiveData.postValue(channelsDataModel);
    }

    @Override
    public void onFailed(Throwable t) {
        Log.d("viewModel Error", t.getMessage());
    }
}
