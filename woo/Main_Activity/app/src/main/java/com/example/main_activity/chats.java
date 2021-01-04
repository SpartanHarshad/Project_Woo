package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class chats extends AppCompatActivity {
    private TextView chTvuserprofile_me, chTvpeoplesMatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        chTvuserprofile_me = findViewById(R.id.tvuserprofile_match);
        chTvpeoplesMatch = findViewById(R.id.tvpeoplesMatch);

        chTvuserprofile_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chats.this,UserProfileMe.class);
                startActivity(intent);
            }
        });

        chTvpeoplesMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(chats.this,View_User_Profile.class);
                startActivity(intent1);
            }
        });
    }
}