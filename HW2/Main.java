package org.example.seminar3.HomeWork.HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HW2 product1 = new HW2("Картофель", "Россия", 100, 15, 1);
        HW2 product2 = new HW2("Лук", "Россия", 20, 30, 2);
        HW2 product3 = new HW2("Репа", "Россия", 15, 15, 2);
        HW2 product4 = new HW2("Укроп", "Россия", 30, 300, 2);
        HW2 product5 = new HW2("Курица", "Россия", 120, 200, 1);
        HW2 product6 = new HW2("Свинина", "Россия", 170, 450, 2);

        List<HW2> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое наименование сорта товара с минимальной ценой, необходимо получить, 1 или 2 ?:  ");
        int searchSort = scanner.nextInt();
        int minPrice = 1001;
        for (HW2 allProduct : allProducts) {
            if (allProduct.getSort().equals(searchSort) &&
                    ((allProduct.getPrice()) < minPrice)) {
                minPrice = (allProduct.getPrice());
            }
        }

        List<String> finalList = new ArrayList<>();
        for (HW2 allProduct : allProducts) {
            if (allProduct.getSort().equals(searchSort) &&
                    ((allProduct.getPrice()) == minPrice)) {
                finalList.add(allProduct.getName());
            }
        }
        System.out.println("Товары " + searchSort + " сорта с минимальной ценой " + minPrice +
                ": " + finalList);
    }
}
