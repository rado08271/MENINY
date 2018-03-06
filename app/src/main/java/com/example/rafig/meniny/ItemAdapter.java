package com.example.rafig.meniny;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


/**
 * Created by rafig on 22. 11. 2017.
 */

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflator;
    String[] name;
    String[] date;

    public ItemAdapter(Context c,String[] i,String[] p){
        name = i;
        date = p;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return name[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //presenting a info..layout inflator
        View v = mInflator.inflate(R.layout.activity_list_view, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView dateTextView = (TextView) v.findViewById(R.id.dateTextView);

        String names = name[i];
        String dates = date[i];

        nameTextView.setText(names);
        dateTextView.setText(dates);

        return v;

    }
}
