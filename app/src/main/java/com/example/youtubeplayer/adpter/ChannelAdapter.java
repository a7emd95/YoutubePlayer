package com.example.youtubeplayer.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeplayer.R;
import com.example.youtubeplayer.models.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.Holder> {
    Context context;
    List<Item> items;

    public ChannelAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.channel_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onDataBinding(context, items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView channelImg;
        TextView channelName;
        TextView channelSubscriptions;
        Button channelBtnSups;

        public Holder(@NonNull View itemView) {
            super(itemView);
            channelImg = itemView.findViewById(R.id.channelLogo);
            channelName = itemView.findViewById(R.id.channelName);
            channelBtnSups = itemView.findViewById(R.id.subscribeBtn);
            channelSubscriptions = itemView.findViewById(R.id.totalsup);
        }

        public void onDataBinding(final Context context, Item item) {
            Picasso.with(context).load(item.getSnippet().getThumbnails()
                    .getMedium().getUrl()).into(channelImg);
            channelName.setText(item.getSnippet().getTitle());
            channelSubscriptions.setText(item.getStatistics().getSubscriberCount());
        }
    }
}