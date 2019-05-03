package com.afrosell.productClient.Service;



import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.Date;


public class ProductClientApp {

    static NamshiLIstOfProducts getProduct(String query){

        Client client = ClientBuilder.newClient();
            WebTarget webTarget = client.target("https://en-ae.namshi.com/api/recos/?widget_list=%5B%221%22%5D&limit=40&locale=en_AE&mad_uuid=a283fa03-7e00-43df-967f-82e00863be53");

        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        NamshiLIstOfProducts response =  invocationBuilder.get(NamshiLIstOfProducts.class);

       // SouqProductModel Product = response.readEntity();
        System.out.println("v");
        return response;

    }

    static void createPrduct(NamshiLIstOfProducts p){
        LocalDate localDate = LocalDate.now();

       for(NamshiProductModel namshiProductModel: p.getProducts()){
           Product newProduct = new Product();
           newProduct.setAddressId("UAE");
           newProduct.setCompaneyId(001L);
           newProduct.setDataCreatedOn(new Date());
           newProduct.setDefaultImage(namshiProductModel.getLink());
           newProduct.setInStock(true);
           newProduct.setListPrice(Double.valueOf(namshiProductModel.getPrice()));
           newProduct.setName(namshiProductModel.getName());
           newProduct.setProductId(Long.valueOf(namshiProductModel.getSku()));
           newProduct.setQuantity(1);
           newProduct.setRank(1);
           newProduct.setUpdatedOn(new Date());
           Client client = ClientBuilder.newClient( );
           WebTarget webTarget = client.target("http://localhost:8080/Afrosell/api/v1/save");
           Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
           Response response = invocationBuilder.post(Entity.entity(newProduct,MediaType.APPLICATION_JSON));
           System.out.println(response);

       }



    }
    public static void main(String[] args) {

        NamshiLIstOfProducts p = getProduct("samsung");
        createPrduct(p);

    }
}
