package org.example;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(ArrayList<Product> products){
        this.products = products;
    }

    public Double calculateTotal() throws Exception {

        if(products.isEmpty())
            throw new Exception("Per fer una venda primer has d’afegir productes");

        for(Product product :this.products){
            totalPrice += product.getPrice();
        }

        return  totalPrice;
    }
}
