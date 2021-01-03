package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View_Profile extends AppCompatActivity {

    private TextView vTvBack_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__profile);

        vTvBack_me = findViewById(R.id.tvback_me);
        vTvBack_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_Profile.this, UserProfileMe.class);
                startActivity(intent);
            }
        });
    }
}