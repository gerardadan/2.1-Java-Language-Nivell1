package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale(List<Product> products){
        this.products = products;
    }

    public Double calculateTotal() throws EmptySaleException {
        if(products.isEmpty())
            throw new EmptySaleException("Please insert products for sale");

        for(Product product :this.products){
            totalPrice += product.getPrice();
        }

        return  totalPrice;
    }
}
