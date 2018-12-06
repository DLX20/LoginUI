package com.example.hp.fifth_work;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.litepal.tablemanager.Connector;

public class registeredActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
        ImageView back = findViewById(R.id.iv_back);
        Button registered = findViewById(R.id.bt_registered);
        registered.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_registered:
                Connector.getDatabase();
                EditText number = findViewById(R.id.et_number);
                EditText pass = findViewById(R.id.et_pass);
                String num = number.getText().toString();
                String passWord = pass.getText().toString();
                Data data = new Data();
                data.setPhone(num);
                data.setPass(passWord);
                if(data.save()) {
                    Toast.makeText(registeredActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(registeredActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(registeredActivity.this,"注册失败",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
