package org.example;

import java.util.Map;

public class Animal {
    private String title;

    private boolean isSold;

    private boolean isAvailable;

    private Map<String, String> photosMap;


    @Override
    public String toString() {
        StringBuilder strBuild = new StringBuilder();
        if (isAvailable){
            strBuild.append(title + " Available " + photosMap);
        }else{
            strBuild.append(title + " Sold " + photosMap);
        }
        return String.valueOf(strBuild);
    }
}