package com.oocool.set_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 欧欧
 * @version 1.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack1");
        list.add("jack2");
        list.add("jack3");
        list.add("jack4");
        list.add("jack5");
        list.add("jack6");
        System.out.println(list);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


    }


}
