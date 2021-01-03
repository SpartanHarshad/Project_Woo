package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Choose_Interest extends AppCompatActivity {

   private TextView chInTvBottomback_LifeStyle, chInTvBottomnext_Aboutme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__interest);

        chInTvBottomback_LifeStyle = findViewById(R.id.tvbottomback_LifeStyle);
        chInTvBottomnext_Aboutme = findViewById(R.id.tvbottomnext_Aboutme);

        chInTvBottomback_LifeStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Choose_Interest.this,LifeStyle_Choices.class);
                startActivity(intent);
            }
        });

        chInTvBottomnext_Aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Choose_Interest.this,About_Me.class);
                startActivity(intent1);
            }
        });
    }
}