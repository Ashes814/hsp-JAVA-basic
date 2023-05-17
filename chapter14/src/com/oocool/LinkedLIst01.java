package com.oocool;

/**
 * @author 欧欧
 * @version 1.0
 */
public class LinkedLIst01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zf = new Node("zf");
        Node hsp = new Node("hsp");
//        System.out.println(jack);
        jack.next = tom;


        tom.next = zf;
        zf.next = hsp;
        zf.pre = tom;
        hsp.pre = zf;

        tom.pre = jack;

        Node first = jack;
        Node last = hsp;


        while (true) {
            if (last == null) {
                break;
            }

            System.out.println(last);
            last = last.pre;
        }


    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
