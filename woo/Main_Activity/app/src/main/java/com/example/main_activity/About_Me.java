package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About_Me extends AppCompatActivity {

    private TextView abMeTvGotoChooseInterest, abMeTvGotoCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__me);
        abMeTvGotoChooseInterest = findViewById(R.id.tvgotochooseinterest);
        abMeTvGotoCity = findViewById(R.id.tvgotoCity);

        abMeTvGotoChooseInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About_Me.this,choose_interest.class);
                startActivity(intent);
            }
        });

        abMeTvGotoCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(About_Me.this,Choose_City.class);
                startActivity(intent1);
            }
        });
    }
}