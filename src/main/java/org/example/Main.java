package org.example;

import utils.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("test1", 10);
        Product p2 = new Product("test2", 20);
        Product p3 = new Product("test3", 30);

        List<Product> products = new ArrayList<Product>((Arrays.asList(p1,p2,p3)));
        setSale(new Sale(products));
        indexoutofboundsexception1((ArrayList<Product>) products, 2);

        List<Product> productsEmpty = new ArrayList<Product>();
        setSale(new Sale(productsEmpty));
        indexoutofboundsexception1((ArrayList<Product>) productsEmpty, 2);
    }

    public static void indexoutofboundsexception1(ArrayList<Product> products, int index) {
        try{
            System.out.println(ListUtils.getElementByIndex(products, index).getName());
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println(ioobe.getMessage());
        }
    }

    public static void setSale(Sale sale){
        try{
            System.out.println("Total price: " + sale.calculateTotal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}