package org.example;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{44, 16, 0, 2};
        BSort Bsort = new BSort();
        int[] result1 = Bsort.BSort(a);
        QSort qSort = new QSort();
        int[] result2 = qSort.QSort(a);

    }
}
