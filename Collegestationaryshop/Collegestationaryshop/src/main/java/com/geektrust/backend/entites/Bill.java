package com.geektrust.backend.entites;

public class Bill{
   private final Apartment apartment;
    private Double totalAmount;

    public Bill(Product Product, Double totalAmount) {
        this.Product = Product;
        this.totalAmount = totalAmount;
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
}
