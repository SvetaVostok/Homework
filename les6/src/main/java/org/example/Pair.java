package org.example;

public class Pair<K, V> {
    public K Key;
    public V Value;
    public Pair(K Key, V Value){
        this.Key = Key;
        this.Value = Value;
    }
    public <K> K getKey(){
        return (K) this.Key;
    }

    public <V> V getValue(){
        return (V) this.Value;
    }
    public void setKey(K o){
        this.Key = o;
    }

    public void setData(V o){
        this.Value = o;
    }
}
