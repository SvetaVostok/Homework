package org.example;

public class LinkedListWithGeneric<T> {
    private tNode root;
    private int size;

    public void add(T item){
        tNode<T> newNode = new tNode(item);
        tNode lastNode = findLast();
        if (lastNode == null){
            root = newNode;
            this.size = 1;
        }else {
            lastNode.setNext(newNode);
            this.size++;
        }
    }
    private tNode findLast(){
        tNode last = null;
        if (root != null) {
            last = root;
            while (last.getNext() != null) {
                last = last.getNext();
            }
        }
        return last;
    }

    public T get(int index){
        tNode res = root;
        int i = 0;
        while (i < index){
            res = res.getNext();
            i++;
        }

        return (T) res.getNode();
    }

    public int size(){
        return this.size;
    }

}
class tNode<K>{
    private K value;
    private  tNode next;
    public tNode(K value) {
        this.value = value;
        this.next = null;
    }

    public tNode(K value, tNode next){
        this.value = value;
        this.next = next;
    }

    public K getNode(){
        return value;
    }

    public void setValue(K value){
        this.value = value;
    }

    public  tNode getNext(){
        return next;
    }

    public void setNext(tNode next){
        this.next = next;
    }


}

