package com.khawarislam.customclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class ProductListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ProductDatasource mProductDatasource=new ProductDatasource();

        ArrayList<Product> arrayList=mProductDatasource.getItemarrayList();

    }


}
