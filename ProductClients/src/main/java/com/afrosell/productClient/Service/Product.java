package com.afrosell.productClient.Service;



import java.util.Date;



public class  Product {





        private Long productId;

        private Long companeyId;


        private String name;


        private double salePrice;

        private double listPrice;

        private String defaultImage;

        private int quantity;

        private boolean isInStock;

        private int rank;

        private Date dataCreatedOn;

        private Date updatedOn;

        private String addressId;
        public Long getProductId() {
            return productId;
        }

        public Long getCompaneyId() {
            return companeyId;
        }

        public String getName() {
            return name;
        }

        public String getAddressId() {
            return addressId;
        }

        public double getSalePrice() {
            return salePrice;
        }

        public double getListPrice() {
            return listPrice;
        }

        public String getDefaultImage() {
            return defaultImage;
        }

        public int getQuantity() {
            return quantity;
        }

        public boolean isInStock() {
            return isInStock;
        }

        public int getRank() {
            return rank;
        }

        public Date getDataCreatedOn() {
            return dataCreatedOn;
        }

        public Date getUpdatedOn() {
            return updatedOn;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public void setCompaneyId(Long companeyId) {
            this.companeyId = companeyId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalePrice(double salePrice) {
            this.salePrice = salePrice;
        }

        public void setListPrice(double listPrice) {
            this.listPrice = listPrice;
        }

        public void setDefaultImage(String defaultImage) {
            this.defaultImage = defaultImage;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setInStock(boolean inStock) {
            isInStock = inStock;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public void setDataCreatedOn(Date dataCreatedOn) {
            this.dataCreatedOn = dataCreatedOn;
        }

        public void setUpdatedOn(Date updatedOn) {
            this.updatedOn = updatedOn;
        }

        public void setAddressId(String addressId) {
            this.addressId = addressId;
        }
    }



