package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class View_User_Profile extends AppCompatActivity {

    private TextView uTvUserProfile, uTvPeoples, Tvchats, TvSetting, TvMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__user__profile);
        uTvUserProfile = findViewById(R.id.tvuserprofile);
        uTvPeoples = findViewById(R.id.tvpeoples);
        Tvchats = findViewById(R.id.tvchats);
        TvSetting = findViewById(R.id.tvsetting);
        TvMore = findViewById(R.id.tvMore);

        uTvUserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_User_Profile.this,UserProfile.class);
                intent
            }
        });

    }
}