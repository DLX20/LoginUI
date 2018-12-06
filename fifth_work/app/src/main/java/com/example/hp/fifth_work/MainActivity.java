package com.example.hp.fifth_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = findViewById(R.id.bt_login);
        Button registered = findViewById(R.id.bt_registered);
        ImageView wx = findViewById(R.id.iv_wx);
        ImageView qq = findViewById(R.id.iv_qq);
        ImageView wb = findViewById(R.id.iv_wb);
        ImageView wy = findViewById(R.id.iv_wy);
        login.setOnClickListener(this);
        registered.setOnClickListener(this);
        wx.setOnClickListener(this);
        qq.setOnClickListener(this);
        wb.setOnClickListener(this);
        wy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_registered:
                Intent intent1 = new Intent(MainActivity.this,registeredActivity.class);
                startActivity(intent1);
                break;
            case R.id.iv_wx:
                Toast.makeText(MainActivity.this,"微信登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_qq:
                Toast.makeText(MainActivity.this,"QQ登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_wb:
                Toast.makeText(MainActivity.this,"微博登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_wy:
                Toast.makeText(MainActivity.this,"网易邮箱登录",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
