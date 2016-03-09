package com.khawarislam.customclass;

import java.util.ArrayList;

/**
 * Created by Hi on 3/8/2016.
 */
public class ProductDatasource {

    public ArrayList<Product> getItemarrayList()
    {


        ArrayList<Product> list = new ArrayList<Product>();

        try {
            for (int i = 0; 1 <= 10; i++)
            {
                Product mproduct = new Product();
                mproduct.setProduct_id("ID" + (i + 2));
                mproduct.setProduct_name("Product" + i);
                mproduct.setProduct_description("Product Description" + (i + 2));
                mproduct.setProduct_price("Price" + (i + 2));
                mproduct.setProduct_image("ic_lion.png");

                list.add(mproduct);
            }


        } catch (Exception e)
        {
        }
        return  list;

    }
}