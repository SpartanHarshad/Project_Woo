package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class my_birthday extends AppCompatActivity {

    private TextView myBTvBackToGender, myTvNextToAddPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_birthday);
        myBTvBackToGender = findViewById(R.id.tvbackg);
        myTvNextToAddPic = findViewById(R.id.tvnextIn);

        myBTvBackToGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_birthday.this, select_gender.class);
                startActivity(intent);
            }
        });

        myTvNextToAddPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(my_birthday.this, add_pic.class);
                startActivity(intent1);
            }
        });
    }
}