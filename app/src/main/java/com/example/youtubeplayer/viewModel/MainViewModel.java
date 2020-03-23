package com.example.youtubeplayer.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youtubeplayer.models.ChannelsDataModel;
import com.example.youtubeplayer.repository.YoutubeChannelCallBack;
import com.example.youtubeplayer.repository.YoutubeChannelRepository;

public class MainViewModel extends ViewModel implements YoutubeChannelCallBack {
     private MutableLiveData<ChannelsDataModel> _channelsLiveData =
              new MutableLiveData<>();
     public  LiveData<ChannelsDataModel> channelsLiveData = _channelsLiveData;
     YoutubeChannelRepository youtubeChannelRepository ;

    public MainViewModel() {
        youtubeChannelRepository = new YoutubeChannelRepository(this);
    }

    public void getChannels(){
        youtubeChannelRepository.getChannels();
    }

    @Override
    public void onSuccess(ChannelsDataModel channelsDataModel) {
        _channelsLiveData.postValue(channelsDataModel);

    }

    @Override
    public void onFailed(Throwable t) {

    }
}
