package com.oocool.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 欧欧
 * @version 1.0
 */
public class List01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("1");

        list.add(2,"nima");
        System.out.println(list);

        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);

        list.set(6, 8838);
        System.out.println(list);

        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()) {
            Object next =  listIterator.next();
            System.out.println(next);

        }

    }
}
