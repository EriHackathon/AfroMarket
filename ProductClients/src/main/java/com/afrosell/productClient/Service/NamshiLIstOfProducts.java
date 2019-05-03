package com.afrosell.productClient.Service;

import java.util.List;

public class NamshiLIstOfProducts {

    private List<NamshiProductModel> products;

    private List<NamshiLIstOfProducts> simples;

    public List<NamshiProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<NamshiProductModel> products) {
        this.products = products;
    }

    public List<NamshiLIstOfProducts> getSimples() {
        return simples;
    }

    public void setSimples(List<NamshiLIstOfProducts> simples) {
        this.simples = simples;
    }
}
