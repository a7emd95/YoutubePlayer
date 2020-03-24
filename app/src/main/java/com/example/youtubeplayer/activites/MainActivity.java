package com.example.youtubeplayer.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.youtubeplayer.R;
import com.example.youtubeplayer.adpter.ChannelAdapter;
import com.example.youtubeplayer.models.ChannelsDataModel;
import com.example.youtubeplayer.viewModel.MainViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    MainViewModel mMainViewModel;
    ChannelAdapter adapter ;
   @BindView(R.id.channelsList) RecyclerView recyclerViewChancels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainViewModel = new  ViewModelProvider(this).get(MainViewModel.class);
        mMainViewModel.getChannels();
        observeLiveDataViewModel();
    }

   private void observeLiveDataViewModel(){
      mMainViewModel.channelsLiveData.observe(this, new Observer<ChannelsDataModel>() {
          @Override
          public void onChanged(ChannelsDataModel channelsDataModel) {
            adapter = new ChannelAdapter(MainActivity.this ,channelsDataModel.getItems() );
              RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
              recyclerViewChancels.setLayoutManager(layoutManager);
              recyclerViewChancels.setAdapter(adapter);
          }
      });
   }
}
