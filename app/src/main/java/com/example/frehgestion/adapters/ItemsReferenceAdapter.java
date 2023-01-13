package com.example.frehgestion.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.frehgestion.R;
import com.example.frehgestion.models.items_reference;

import java.util.List;

public class ItemsReferenceAdapter extends BaseAdapter {
    //fiels
    private final Context context;
    private List<items_reference> items_referenceList;
    private LayoutInflater inflater;

    //constructeur
    public ItemsReferenceAdapter(Context context,List<items_reference> items_referenceList)
    {
        this.context=context;
        this.items_referenceList=items_referenceList;
        this.inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return items_referenceList.size();
    }

    @Override
    public items_reference getItem(int position) {
        return items_referenceList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.adapter_item, null);

        return view;
    }
}
