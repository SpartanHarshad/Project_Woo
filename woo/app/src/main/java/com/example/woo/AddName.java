package com.example.woo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddName extends AppCompatActivity {

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
                    Intent intent = new Intent(AddName.this, AddGender.class);
                    intent.putExtra("Fname",Fname);
                    intent.putExtra("Lname",Lname);
                    startActivity(intent);
                }
            }
        });
    }
}