package com.mycompany.supermarket_project.model;


import java.util.Date;

public class Product {
    
    private long id;
    private String name;
    private int quantity;
    private int minQuantity;
    private Date expireDate;
    private double price;
    private String description;
    private float offer=0;
    
    public Product(long id,String name,int quantity,int minQuantity,Date expireDate,double price,String description){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.minQuantity=minQuantity;
        this.expireDate=expireDate;
        this.price=price;
        this.description=description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public float getOffer() {
        return offer;
    }

    public void setOffer(float offer) {
        this.offer = offer;
    }
    
}
