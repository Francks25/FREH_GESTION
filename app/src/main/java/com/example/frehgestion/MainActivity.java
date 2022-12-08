package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textp1;
Button btn_conp1, btn_insp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_conp1=findViewById(R.id.but_con);
        btn_insp1=findViewById(R.id.but_ins);
        textp1=findViewById(R.id.mot1);
        btn_conp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob= new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(ob);
            }
        });

        btn_insp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob = new Intent(getApplicationContext(),Inscription.class);
                startActivity(ob);
            }
        });
        textp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//textp1.setTextColor("000");
            }
        });
    }
}