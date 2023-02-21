package org.example.seminar3.HomeWork.HW1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        HW1 product1 = new HW1("Куркума высший сорт", 400, 1);
        HW1 product2 = new HW1("Гречка", 20, 2);
        HW1 product3 = new HW1("Сахар", 10, 3);
        HW1 product4 = new HW1("Финики высший сорт", 300, 2);
        HW1 product5 = new HW1("Фисташки", 400, 1);
        HW1 product6 = new HW1("Картофель высший сорт", 15, 1);

        List<HW1> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);

        int maxPrice = 0;
        for (HW1 allProduct : allProducts) {
            if (((allProduct.getSort().equals(1)) ||
                    (allProduct.getSort().equals(2)))
                    &&
                    (allProduct.getName().contains("высший"))) {
                if ((allProduct.getPrice()) > maxPrice) {
                    maxPrice = allProduct.getPrice();
                }
            }

        }
        System.out.println("наибольшая цене товаров 1го или 2го сорта среди товаров," +
                " название которых содержит «высший»: " + maxPrice);
    }
}