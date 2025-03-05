package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("test1", 10);
        Product p2 = new Product("test2", 20);
        Product p3 = new Product("test3", 30);

        ArrayList<Product> products1 = new ArrayList<Product>();
        ArrayList<Product> products2 = new ArrayList<Product>((Arrays.asList(p1,p2,p3)));
        Sale sale = new Sale(products1);

        try{
            System.out.println(sale.calculateTotal());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}