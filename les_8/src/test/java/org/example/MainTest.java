package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MainTest {

    @Test
    public void countWords() {
        Counter count = new Counter();
        HashMap<String, Integer> m = new HashMap();
        m.put("мама", 11);
        m.put("кошка", 4);
        m.put("математика", 1);
        m.put("тетрадь", 1);
        m.put("солнце", 2);
        HashMap n = count.countWords("TEST.txt");
        Assert.assertEquals(m, n);
    }
}