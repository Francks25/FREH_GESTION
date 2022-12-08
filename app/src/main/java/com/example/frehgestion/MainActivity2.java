package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText logp2, passp2;
    TextView oubp2, errp2;
    Button conp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        logp2=findViewById(R.id.log);
        passp2=findViewById(R.id.pass);
        oubp2=findViewById(R.id.oublie);
        errp2=findViewById(R.id.errcon);
        conp2=findViewById(R.id.but_con2);
        oubp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),Pageverif.class);
                startActivity(ob);
            }
        });

        conp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),Menu.class);
                startActivity(ob);
            }
        });
    }
}