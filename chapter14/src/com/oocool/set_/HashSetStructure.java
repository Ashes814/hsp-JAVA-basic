package com.oocool.set_;

/**
 * @author 欧欧
 * @version 1.0
 */
public class HashSetStructure  {
    public static void main(String[] args) {
        Node[] linkedTable = new Node[16];

        Node rose = new Node("rose", null);
        Node jack = new Node("jack", rose);
        Node john = new Node("john", jack);
        linkedTable[2] = john;

        Node lucy = new Node("lucy", null);
        linkedTable[3] = lucy;


    }
}

class Node {
    Object item;

    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
