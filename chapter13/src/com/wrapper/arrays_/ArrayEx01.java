package com.wrapper.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ArrayEx01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] =  new Book("red dream", 100.001);
        books[1] =  new Book("Gold dream", 99.992);
        books[2] =  new Book("young dream", 99.9318);
        books[3] =  new Book("java dream", 99.9923);
//       showBooks(books);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getPrice() - o2.getPrice() >= 0) ? 1 : -1;
            }
        });

        showBooks(books);
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return (int) (o2.getPrice() - o1.getPrice());
//            }
//        });
//
//        showBooks(books);

//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return (int) (o2.getName().length() - o1.getName().length());
//            }
//        });
//
//        showBooks(books);
    }

    public static void showBooks(Book[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + ": ¥" + getPrice() ;
    }
}


