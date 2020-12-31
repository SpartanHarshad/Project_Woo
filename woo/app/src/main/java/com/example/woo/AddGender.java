package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddGender extends AppCompatActivity {

    private TextView adgtxt_next, adgtxt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_gender);

        adgtxt_back = findViewById(R.id.txt_back);
        adgtxt_next = findViewById(R.id.txt_nextg);

        adgtxt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddGender.this, MyBirthDay.class);
                startActivity(intent);
            }
        });

        adgtxt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AddGender.this, AddName.class);
                startActivity(intent1);
            }
        });
    }
}