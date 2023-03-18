package org.example;

public class LinkedList {
    private Node root;
    private int size;

    public void add(Object item){
        Node newNode = new Node(item);
        Node lastNode = findLast();
        if (lastNode == null){
            root = newNode;
            this.size = 1;
        }else {
            lastNode.setNext(newNode);
            this.size++;
        }
    }
    private Node findLast(){
        Node last = null;
        if (root != null) {
            last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }
        return last;
    }

    public Object get(int index){
        Node res = root;
        int i = 0;
        while (i < index){
            res = res.getNext();
            i++;
        }

        return res.getNode();
    }

    public int size(){
        return this.size;
    }

}
class Node{
    private Object value;
    private  Node next;
    public Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }

    public  Object getNode(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public  Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }


}

