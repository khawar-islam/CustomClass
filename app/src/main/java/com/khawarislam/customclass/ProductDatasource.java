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
            for (int i = 0; i <= 10; i++) {
                Product item = new Product();
                item.setProduct_id(i + "");
                item.setProduct_name("Product No:" + (i + 1));
                item.setProduct_price(i * 10 + " PKR");
                item.setProduct_description("Description of product " + i);
                item.setProduct_image("ic_stub.png");
                list.add(item);
            }



        } catch (Exception e)
        {
        }
        return  list;

    }
    public long insert(Product product) {
        return 0;

    }
}