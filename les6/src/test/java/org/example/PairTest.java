package org.example;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @org.junit.Test
    public void Test1() {
        Integer K = 5;
        Integer V = 10;
        Pair<Integer, Integer> p = new Pair<Integer, Integer>(K, V);
        Assert.assertEquals(K , p.getKey());
        Assert.assertEquals(V , p.getValue());
    }

    @org.junit.Test
    public void Test2() {
        Integer K = 5;
        String V = "мяу";
        Pair<Integer, String> p = new Pair<Integer, String>(K, V);
        Assert.assertEquals(K , p.getKey());
        Assert.assertEquals(V , p.getValue());
    }
}