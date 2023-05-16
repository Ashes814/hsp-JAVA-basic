package com.oocool.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author 欧欧
 * @version 1.0
 */
public class ListSort {

    public static void main(String[] args) {
//        List bookList = new ArrayList();
        List bookList = new Vector();
//        List bookList = new LinkedList();
        for (int i = 0; i < 3; i++) {
            bookList.add(new Book(i + "book", i + "author", i*100));
        }
        System.out.println(bookList);

        Book temp = (Book) bookList.get(0);
        for (int i = 0; i < bookList.size() - 1; i++) {
            for (int j = 0; j < bookList.size() - 1 - i; j++) {
                Book bookj = (Book) bookList.get(j);
                Book bookjp = (Book) bookList.get(j + 1);
                if (bookjp.getPrice() > bookj.getPrice()) {
                    temp = bookjp;
                    bookList.set(j + 1, bookList.get(j));
                    bookList.set(j, temp);
                }
            }
        }
        System.out.println(bookList);
    }


}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
