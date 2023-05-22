package com.wrapper.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 欧欧
 * @version 1.0
 */
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String) o2).length() - ((String) o1).length();
//            }
//        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);
    }
}
