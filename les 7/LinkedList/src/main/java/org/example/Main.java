package org.example;


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("!");
        System.out.println(ll.size());
        System.out.println((String) ll.get(0));
        LinkedListWithGeneric <String> ll2 = new LinkedListWithGeneric();
        ll2.add("5");
        ll2.add("8");
        ll2.add("9");
        ll2.add("?");
        System.out.println(ll2.size());
        System.out.println((String) ll2.get(1));

    }
}