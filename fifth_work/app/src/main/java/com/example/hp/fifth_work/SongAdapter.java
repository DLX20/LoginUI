package com.example.hp.fifth_work;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<SongData> mSongList;

    public SongAdapter(List<SongData> songDataList){
        mSongList = songDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.song_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        SongData songData = mSongList.get(i);
        viewHolder.songImage.setImageResource(songData.getImageId());
        viewHolder.songName.setText(songData.getName());
        viewHolder.songNum.setText(songData.getNum());
    }

    @Override
    public int getItemCount() {
        return mSongList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView songImage;
        TextView songName;
        TextView songNum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songImage = itemView.findViewById(R.id.song_image);
            songName = itemView.findViewById(R.id.song_name);
            songNum = itemView.findViewById(R.id.song_num);
        }
    }
}
