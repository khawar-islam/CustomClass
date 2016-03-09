package com.khawarislam.customclass;
public class Product {
    private String product_id;
    private String product_price;
    private String product_name;
    private String product_image;
    private String product_description;
    public String getProduct_id()
    {
         return product_id;
    }

    public  void setProduct_id(String _product_id)
    {
         this.product_id=_product_id;
    }

    public String getProduct_name()
    {
        return product_name;
    }

    public void setProduct_name(String _product_name)
    {
        this.product_name=_product_name;
    }

    public  String getProduct_price()
    {
        return  product_price;
    }

    public void setProduct_price(String _product_name)
    {
        this.product_price=_product_name;
    }

    public String getProduct_image()
    {
        return  product_image;
    }

    public void setProduct_image(String _product_image)
    {
        this.product_image=_product_image;
    }

    public String getProduct_description()
    {
        return  product_description;
    }

    public void  setProduct_description(String _product_description)
    {
        this.product_description=_product_description;
    }
}