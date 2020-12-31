package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WooSignIn extends AppCompatActivity {
    private Button mBtnSignin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woo_sign_in);
        mBtnSignin = findViewById(R.id.btnsignin);
        mBtnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WooSignIn.this, EnterMobileNo.class);
                startActivity(intent);
            }
        });
    }
}