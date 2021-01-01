package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LifeStyle_Choices extends AppCompatActivity {

    private TextView lifchTvBottomBack_Relationship, lifchTvBottomNext_Intres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_style__choices);
        lifchTvBottomBack_Relationship = findViewById(R.id.tvbottomback_Relationship);
        lifchTvBottomNext_Intres = findViewById(R.id.tvbottomnext_Intres);

        lifchTvBottomBack_Relationship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeStyle_Choices.this,RelationShip_LiftStyle.class);
                startActivity(intent);
            }
        });

        lifchTvBottomNext_Intres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(LifeStyle_Choices.this,Choose_Interest.class);
                startActivity(intent1);
            }
        });

    }
}