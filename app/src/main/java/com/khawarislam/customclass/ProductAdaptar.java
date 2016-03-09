package com.khawarislam.customclass;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdaptar extends ArrayAdapter<Product> {

    Context context;
    ArrayList<Product> arrayList;

    public ProductAdaptar(Context _context, ArrayList<Product> objects) {
        super(_context, R.layout.row_product_list, objects);
        this.context = _context;
        this.arrayList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Product item=getItem(position);
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.row_product_list,parent,false);
        TextView tvProductname=(TextView) rowView.findViewById(R.id.row_productname);
        TextView tvProductPrice=(TextView) rowView.findViewById(R.id.row_productprice);

        tvProductname.setText(item.getProduct_name());
        tvProductPrice.setText(item.getProduct_price());



        return  rowView;
    }
}