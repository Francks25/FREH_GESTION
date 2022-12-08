package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inscription extends AppCompatActivity {
    EditText mailp3, pawdp3, pawdconfp3,codp3;
    Button btn_insp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        mailp3=findViewById(R.id.mail);
        pawdp3=findViewById(R.id.passwdp3);
        pawdconfp3=findViewById(R.id.passwdconfp3);
        codp3=findViewById(R.id.codep3);
        btn_insp3=findViewById(R.id.but_insp3);
        btn_insp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),Menu.class);
                startActivity(ob);
            }
        });
    }
}