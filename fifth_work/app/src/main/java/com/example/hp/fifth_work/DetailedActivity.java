package com.example.hp.fifth_work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DetailedActivity extends AppCompatActivity {

    private List<SongData> songDataList = new ArrayList<>();
//    StringBuilder newstringBuilder = new StringBuilder();
//    InputStream inputStream = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
//        try {
//            inputStream = getResources().getAssets().open("json.txt");
////            InputStreamReader isr = new InputStreamReader(inputStream);
////            BufferedReader reader = new BufferedReader(isr);
////            String text;
//            String text = readTextFromSDcard(inputStream);
//            AnalysisJson(text);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        initSong();
        RecyclerView recyclerView = findViewById(R.id.rc_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SongAdapter adapter = new SongAdapter(songDataList);
        recyclerView.setAdapter(adapter);
    }

    private void initSong() {
        Random random = new Random();
        for(int i=0;i<50;i++){
            SongData song = new SongData();
            song.setName("这是第"+i+"个歌单");
            song.setNum("共"+random.nextInt(500)+"首");
            song.setImageId(R.drawable.bg_main);
            songDataList.add(song);
        }
    }

//    private void AnalysisJson(String text) {
//        Gson gson = new Gson();
//        songDataList = gson.fromJson(text,new TypeToken<List<SongData>>(){}.getType());
//        for (SongData songData : songDataList){
//            Log.d("DetailActivity","name is"+songData.getName());
//            Log.d("DetailActivity","num is"+songData.getNum());
//        }
//    }
//
//    public String readTextFromSDcard(InputStream is) throws Exception{
//        InputStreamReader reader = new InputStreamReader(is,"GB2312");
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        StringBuffer buffer = new StringBuffer("");
//        String str;
//        while ((str = bufferedReader.readLine()) != null) {
//            buffer.append(str);
//            buffer.append("\n");
//        }
//        return buffer.toString();//把读取的数据返回
//    }
}
