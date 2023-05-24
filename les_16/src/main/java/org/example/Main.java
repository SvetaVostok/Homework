package org.example;

import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printTableMult();
        StringMap stringMap = new StringMap();
        LinkedHashMap<String, String> linkedHashMap = stringMap.createMap("-importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12 -deststoretype PKCS12");
        System.out.println("-importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12 -deststoretype PKCS12");
        System.out.println(stringMap.createString(linkedHashMap));
    }

    public static void printTableMult(){
        IntStream.range(1, 10).peek(x -> System.out.println("Для " + x)).
            forEach(x -> IntStream.rangeClosed(1, 10).
                    forEach(y -> System.out.println(x + " * " + y + " = " + x*y)));
    }

}