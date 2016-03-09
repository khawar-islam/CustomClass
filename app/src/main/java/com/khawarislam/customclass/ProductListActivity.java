package com.khawarislam.customclass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductListActivity extends Activity {

    ListView mListView;
    Context context;
    ArrayList<Product> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_product_list);

        ProductDatasource mProductDatasource=new ProductDatasource();

        ArrayList<Product> arrayList=mProductDatasource.getItemarrayList();

        ListView mListviewproduct=(ListView) findViewById(R.id.product_listview);

      ProductAdaptar mProductAdaptar=new ProductAdaptar(context, arrayList);

        mListviewproduct.setAdapter(mProductAdaptar);

    }


}
