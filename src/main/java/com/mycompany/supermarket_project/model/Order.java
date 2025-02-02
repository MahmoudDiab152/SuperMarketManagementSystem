package com.mycompany.supermarket_project.model;
import utility.database_navigation.*;

public class Order{
    private long itemId;
    private Long orderId;
    private int quantity;
    private double price;
    
    public Order(long itemId,int quantity,Long orderId){
        this.orderId = orderId;
        this.itemId=itemId;
        this.quantity=quantity;
        
        productDB prodDB = new productDB();
        Product prod = prodDB.getProductById(itemId);

        if (prod == null) {
            this.price = 0;
            throw new IllegalArgumentException("Product with id " + itemId + " does not exist");
        }
        
        System.out.println(prod.getOffer());
        this.price = prod.getPrice()*this.quantity*((100.0-(double)prod.getOffer())/100.0);
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }
    
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
