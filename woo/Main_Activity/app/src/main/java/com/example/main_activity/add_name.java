package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class add_name extends AppCompatActivity {

    private TextView adTxt_Next;
    private EditText adEtFname, adEtLname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name);

        adEtFname = findViewById(R.id.etFname);
        adEtLname = findViewById(R.id.etLname);
        adTxt_Next = findViewById(R.id.txt_next);

        adTxt_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fname = adEtFname.getText().toString();
                String Lname = adEtLname.getText().toString();
                if(Fname.isEmpty())
                {
                    adEtFname.setError("First Name Is mandatory");
                }
                else
                {
                    Intent intent = new Intent(add_name.this, select_gender.class);
                    intent.putExtra("Fname",Fname);
                    intent.putExtra("Lname",Lname);
                    startActivity(intent);
                }
            }
        });

    }
}