package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Myactivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;


    public void init() {
        //mButton = findViewById(R.id.BackButton);
        mButton.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setTitle("嗨~好久不见！");
        builder.setMessage("菩提本无树，明镜亦非台");
        AlertDialog b = builder.create();
//      显示对话框
        b.show();

    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.my_activity);
        init();
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(Myactivity.this, MainActivity.class);
        Intent getIntent = getIntent();
        String value = getIntent.getStringExtra("Data");
        Log.e("MainActivity", value);
//                获取数据结束
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher_background);

        builder.setTitle("传递数据");
        builder.setMessage(value);
        AlertDialog b = builder.create();
//      显示对话框
        b.show();
        startActivity(intent);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
