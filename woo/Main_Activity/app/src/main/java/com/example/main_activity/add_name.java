package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_name extends AppCompatActivity {
    
    private Button btnNext;
    private EditText etFirstName;
    private EditText etLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_name);
        btnNext = findViewById(R.id.btnNext);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( add_name.this, enter_mobile_no.class);
                startActivity(intent);
            }
        });
        
        etFirstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FirstName = etFirstName.getText().toString();
                if (FirstName.isEmpty()){
                    etFirstName.setError("First name cannot be empty");
                }
                else {
                    Intent intent1 = new Intent( add_name.this, select_gender.class);
                    startActivity(intent1);
                }
            }
        });
    }
}