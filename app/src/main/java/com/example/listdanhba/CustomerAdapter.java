package com.example.listdanhba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter extends BaseAdapter {
    Context context;
    ArrayList<Model> Data;
    LayoutInflater layoutInflater;
    Model model;

    public CustomerAdapter(Context context, ArrayList<Model> data) {
        this.context = context;
        this.Data = data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Data.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if(rowView==null){
            rowView=layoutInflater.inflate(R.layout.product,null,true);
        }

        ImageView image = rowView.findViewById(R.id.product_img);
        TextView name = rowView.findViewById(R.id.product_name);
        TextView sodt=rowView.findViewById(R.id.product_sodt);

        model=Data.get(position);
        image.setImageResource(model.getImage());
        name.setText(model.getName());
        sodt.setText(model.getSdt());


        return rowView;
    }
}
