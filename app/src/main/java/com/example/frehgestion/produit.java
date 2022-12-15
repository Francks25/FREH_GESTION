package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class produit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);

        ListView list = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> tableau = new ArrayAdapter<>(list.getContext(), R.layout.activity_montexte);
        for(int i=0; i<40; i++) {
            tableau.add("coucou " + i); }
        list.setAdapter(tableau);
    }
}