package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfileMe extends AppCompatActivity {

    private Button ubtn_view_Profile;
    private TextView uTvpeoples_me, uTvchats_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_me);

        ubtn_view_Profile = findViewById(R.id.btn_view_Profile);
        uTvpeoples_me = findViewById(R.id.tvpeoples_me);
        uTvchats_me = findViewById(R.id.tvchats_me);

        ubtn_view_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfileMe.this,View_Profile.class);
                startActivity(intent);
            }
        });

        uTvpeoples_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(UserProfileMe.this,View_User_Profile.class);
                startActivity(intent1);
            }
        });

        uTvchats_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(UserProfileMe.this,chats.class);
                startActivity(intent2);
            }
        });
    }
}