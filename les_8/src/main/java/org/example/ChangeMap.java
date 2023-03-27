package org.example;

import java.util.*;

public class ChangeMap {
    public <V, K>HashMap inverse(HashMap<K, V> map){
        HashMap<V, K> newMap = new HashMap();
        for (K key: map.keySet()){
            newMap.put(map.get(key), key);
        }
        return newMap;
    }
}
