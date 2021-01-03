package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterMobileNo extends AppCompatActivity {

    private View emViBackArrow;
    private Button emBtnGetMobno;
    private EditText emEtvMobNum ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_mobile_no);
        emViBackArrow = findViewById(R.id.viback);
        emBtnGetMobno = findViewById(R.id.btngetMobno);
        emEtvMobNum = findViewById(R.id.etmobnum);
        emViBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterMobileNo.this,WooSignIn.class);
                startActivity(intent);
            }
        });

        emBtnGetMobno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String MobNumber = emEtvMobNum.getText().toString();
                if(MobNumber.isEmpty()){
                    emEtvMobNum.setError("Please Fill Mobile No");
                }
                else if (MobNumber.length() != 10){
                    emEtvMobNum.setError("Mobile No Must Be 10 Digit");
                }
                else {
                    Intent intent1 = new Intent(EnterMobileNo.this, AddName.class);
                    intent1.putExtra("MobNo",MobNumber);
                    startActivity(intent1);
                }
            }
        });
    }
}