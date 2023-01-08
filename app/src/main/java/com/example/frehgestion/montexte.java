package com.example.frehgestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.frehgestion.adapters.ItemsReferenceAdapter;
import com.example.frehgestion.models.items_reference;

import java.util.ArrayList;
import java.util.List;

public class montexte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montexte);

        //list of items
        List<items_reference> itemsList= new ArrayList<>();
        itemsList.add(new items_reference("laptop", 300.0));
        itemsList.add(new items_reference("disque Dur", 200));
        itemsList.add(new items_reference("telephone", 150));

        //getlistview
        ListView shopListView = findViewById(R.id.l1);
        shopListView.setAdapter(new ItemsReferenceAdapter(this, itemsList));
    }

}