package com.afrosell.productClient.Service;

import java.util.List;

public class SouqResponseModel {

    String viewType;
    List<SouqProductModel> products;


    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public void setProducts(List<SouqProductModel> products) {
        this.products = products;
    }

    public String getViewType() {
        return viewType;
    }

    public List<SouqProductModel> getProducts() {
        return products;
    }
}
