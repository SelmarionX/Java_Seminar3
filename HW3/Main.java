package org.example.seminar3.HomeWork.HW3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HW3 book1 = new HW3("Вечность", "Булгаков", 100, 2008, 270);
        HW3 book2 = new HW3("Античность", "Агапов", 150, 2015, 131);
        HW3 book3 = new HW3("Путь", "Петров", 200, 2020, 307);
        HW3 book4 = new HW3("Утопия", "Антонов", 100, 2001, 179);
        HW3 book5 = new HW3("Дорога", "Аюпов", 250, 2022, 311);
        HW3 book6 = new HW3("Заметки", "Сидоров", 100, 2012, 250);

        List<HW3> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);

        List<String> nameList = new ArrayList<>();
        for (HW3 allBook : allBooks) {
            if ((checkSimple(allBook.getPages())) &&
                    (allBook.getAuthor().contains("А")) &&
                    ((allBook.getYear()) >= 2010)) {
                nameList.add(allBook.getName());
            }
        }
        System.out.println("Названия книг, в которых простое количество страниц, фамилия автора содержит «А» " +
                "и год издания после 2010 г, включительно: " + nameList);

    }

    public static boolean checkSimple(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
