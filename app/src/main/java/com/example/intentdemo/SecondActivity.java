package com.example.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView supermoon;
    ImageView waterfall;
    private int imageID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        supermoon = findViewById(R.id.moon);
        waterfall = findViewById(R.id.waterfall);

        supermoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.supermoon;
                finish();
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.waterfall;
                finish();
            }
        });

    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        intent.putExtra("imageID",imageID);

        setResult(RESULT_OK, intent);
        super.finish();

    }
}
