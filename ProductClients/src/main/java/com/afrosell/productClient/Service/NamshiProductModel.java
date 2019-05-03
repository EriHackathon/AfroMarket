package com.afrosell.productClient.Service;

public class NamshiProductModel {

    private String sku;
    private String name;
    private String link;
    private String price;
    private Brand  brand;
    private String image_key;


    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getImage_key() {
        return image_key;
    }

    public void setImage_key(String image_key) {
        this.image_key = image_key;
    }


}
