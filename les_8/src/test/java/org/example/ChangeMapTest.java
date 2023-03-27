package org.example;

import org.junit.Assert;

import java.util.HashMap;

public class ChangeMapTest {

    @org.junit.Test
    public void inverse() {
        HashMap<Integer, String> map = new HashMap();
        HashMap<String, Integer> newMap = new HashMap();
        map.put(10, "я");
        map.put(2, "мы");
        newMap.put("я", 10);
        newMap.put("мы", 2);
        ChangeMap chmap = new ChangeMap();
        HashMap newmap = chmap.inverse(map);
        Assert.assertEquals(chmap, newmap);
    }
}