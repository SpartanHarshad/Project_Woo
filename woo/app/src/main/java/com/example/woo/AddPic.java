package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddPic extends AppCompatActivity {

    private TextView adPicTvBottom_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pic);
        adPicTvBottom_next = findViewById(R.id.tvbottom_next);
        adPicTvBottom_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPic.this,RelationShip_LiftStyle.class);
                startActivity(intent);
            }
        });
    }
}