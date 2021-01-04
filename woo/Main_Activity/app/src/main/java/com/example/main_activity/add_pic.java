package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class add_pic extends AppCompatActivity {

    private TextView adPicTvBottom_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pic);
        adPicTvBottom_next = findViewById(R.id.tvbottom_next);
        adPicTvBottom_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add_pic.this,relationship_lifestyle.class);
                startActivity(intent);
            }
        });
    }
}