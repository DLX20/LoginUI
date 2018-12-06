package com.example.hp.fifth_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.litepal.LitePal;

import java.util.List;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = findViewById(R.id.bt_login);
        ImageView back = findViewById(R.id.iv_back);
        back.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_login:
                EditText number = findViewById(R.id.et_number);
                EditText pass = findViewById(R.id.et_pass);
                String num = number.getText().toString();
                String passWord = pass.getText().toString();
                List<Data> datas = LitePal.findAll(Data.class);
                for (int i = 0; i <datas.size() ; i++) {
                    if(datas.get(i).getPass().equals(passWord)&&datas.get(i).getPhone().equals(num)){
                        Intent intent = new Intent(LoginActivity.this,DetailedActivity.class);
                        startActivity(intent);
                        break;
                    }
                }
                break;
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
