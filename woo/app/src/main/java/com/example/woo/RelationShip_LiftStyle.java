package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RelationShip_LiftStyle extends AppCompatActivity {

    private TextView relaTvBottomBack, relaTvBottomNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation_ship__lift_style);

        relaTvBottomBack = findViewById(R.id.tvbottomback_Addpic);
        relaTvBottomNext = findViewById(R.id.tvbottomnext_Lifechoice);

        relaTvBottomBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelationShip_LiftStyle.this,AddPic.class);
                startActivity(intent);
            }
        });

        relaTvBottomNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(RelationShip_LiftStyle.this,LifeStyle_Choices.class);
                startActivity(intent1);
            }
        });
    }
}