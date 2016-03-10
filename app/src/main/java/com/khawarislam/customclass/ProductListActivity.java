package com.khawarislam.customclass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductListActivity extends Activity {

    ListView mListView;
    Context context;
    ArrayList<Product> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_product_list);
        arrayList = new ArrayList<>();
        final ProductDatasource mProductDatasource=new ProductDatasource();

        arrayList=mProductDatasource.getItemarrayList();
        mListView=(ListView) findViewById(R.id.product_listview);

        ProductAdaptar mProductAdaptar=new ProductAdaptar(context, arrayList);
        mListView.setAdapter(mProductAdaptar);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product mProduct = arrayList.get(position);
                mProductDatasource.insert(mProduct);
                Toast.makeText(context, mProduct.getProduct_name(), Toast.LENGTH_SHORT).show();
            }
        });



    }


}
