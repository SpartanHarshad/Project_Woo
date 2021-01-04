package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class select_gender extends AppCompatActivity {

    private TextView adgtxt_next, adgtxt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gender);

        adgtxt_back = findViewById(R.id.txt_back);
        adgtxt_next = findViewById(R.id.txt_nextg);

        adgtxt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select_gender.this, my_birthday.class);
                startActivity(intent);
            }
        });

        adgtxt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(select_gender.this, add_name.class);
                startActivity(intent1);
            }
        });
    }
}