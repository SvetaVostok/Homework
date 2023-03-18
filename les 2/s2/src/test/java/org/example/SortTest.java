package org.example;

import org.junit.Assert;

public class SortTest {

    @org.junit.Test//Случайный Массив
    public void BSortTest1() {
        int[] a = new int[]{2, 6, 3, 2, 1, 0, 77};
        int[] res = new int[]{0, 1, 2, 2, 3, 6, 77};
        BSort Bsort = new BSort();
        Assert.assertArrayEquals(res, Bsort.BSort(a));
    }
    @org.junit.Test//Отсортированный  Массив
    public void BSortTest2() {
        int[] a = new int[]{0, 1, 2, 2, 3, 6, 77};
        int[] res = new int[]{0, 1, 2, 2, 3, 6, 77};
        BSort Bsort = new BSort();
        Assert.assertArrayEquals(res, Bsort.BSort(a));
    }
    @org.junit.Test//Обратыный Массив
    public void BSortTest3() {//Обратыный Массив
        int[] a = new int[]{77, 6, 3, 2, 2, 1, 0};
        int[] res = new int[]{00, 1, 2, 2, 3, 6, 77};
        BSort Bsort = new BSort();
        Assert.assertArrayEquals(res, Bsort.BSort(a));
    }
    @org.junit.Test//Случайный Массив
    public void QSortTest1() {
        int[] a = new int[]{2, 6, 3, 2, 1, 0, 77};
        int[] res = new int[]{0, 1, 2, 2, 3, 6, 77};
        QSort qSort = new QSort();
        Assert.assertArrayEquals(res, qSort.QSort(a));
    }
    @org.junit.Test//Отсортированный  Массив
    public void QSortTest2() {
        int[] a = new int[]{0, 1, 2, 2, 3, 6, 77};
        int[] res = new int[]{0, 1, 2, 2, 3, 6, 77};
        QSort qSort = new QSort();
        Assert.assertArrayEquals(res, qSort.QSort(a));
    }
    @org.junit.Test //Обратыный Массив
    public void QSortTest3() {
        int[] a = new int[]{77, 6, 3, 2, 2, 1, 0};
        int[] res = new int[]{0, 1, 2, 2, 3, 6, 77};
        QSort qSort = new QSort();
        Assert.assertArrayEquals(res, qSort.QSort(a));
    }
}