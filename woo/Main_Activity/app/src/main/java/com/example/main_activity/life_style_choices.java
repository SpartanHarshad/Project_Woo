package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class life_style_choices extends AppCompatActivity {

    private TextView lifchTvBottomBack_Relationship, lifchTvBottomNext_Intres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_style_choices);

        lifchTvBottomBack_Relationship = findViewById(R.id.tvbottomback_Relationship);
        lifchTvBottomNext_Intres = findViewById(R.id.tvbottomnext_Intres);

        lifchTvBottomBack_Relationship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(life_style_choices.this,relationship_lifestyle.class);
                startActivity(intent);
            }
        });

        lifchTvBottomNext_Intres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(life_style_choices.this,choose_interest.class);
                startActivity(intent1);
            }
        });
    }
}