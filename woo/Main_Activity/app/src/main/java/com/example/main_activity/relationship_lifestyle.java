package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class relationship_lifestyle extends AppCompatActivity {

    private TextView relaTvBottomBack, relaTvBottomNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationship_lifestyle);



        relaTvBottomBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relationship_lifestyle.this,add_pic.class);
                startActivity(intent);
            }
        });

        relaTvBottomNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(relationship_lifestyle.this,life_style_choices.class);
                startActivity(intent1);
            }
        });
    }
}