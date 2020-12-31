package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyBirthDay extends AppCompatActivity {

    private TextView myBTvBackToGender, myTvNextToAddPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_birth_day);

        myBTvBackToGender = findViewById(R.id.tvbackg);
        myTvNextToAddPic = findViewById(R.id.tvnextIn);

        myBTvBackToGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBirthDay.this, AddGender.class);
                startActivity(intent);
            }
        });

        myTvNextToAddPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MyBirthDay.this, AddPic.class);
                startActivity(intent1);
            }
        });
    }
}