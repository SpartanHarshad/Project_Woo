package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Choose_City extends AppCompatActivity {

    private TextView chcityTvGotoViewProfile, chcityTvGotoAboutme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__city);

        chcityTvGotoViewProfile = findViewById(R.id.tvgotoViewProfile);
        chcityTvGotoAboutme = findViewById(R.id.tvgotoaboutme);

        chcityTvGotoAboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Choose_City.this,About_Me.class);
                startActivity(intent1);
            }
        });
        chcityTvGotoViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Choose_City.this,View_User_Profile.class);
                startActivity(intent);
            }
        });
    }
}