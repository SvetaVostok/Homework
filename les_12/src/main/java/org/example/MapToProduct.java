package org.example;

import java.lang.reflect.Field;
import java.util.*;

public class MapToProduct {
    public Animal mapToProductDto(Pet pet) throws NoSuchFieldException, IllegalAccessException {
        Class cl = pet.getClass();
        Animal animal = new Animal();
        Field titleField = cl.getDeclaredField("name");
        titleField.setAccessible(true);
        String title = (String) titleField.get(pet);
        Field statusField = cl.getDeclaredField("status");
        statusField.setAccessible(true);
        Status status = (Status) statusField.get(pet);
        Field photoField = cl.getDeclaredField("photosList");
        photoField.setAccessible(true);
        List<Photo> photos = (List<Photo>) photoField.get(pet);

        Class cl2 = animal.getClass();
        titleField = cl2.getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(animal, title);
        statusField = cl2.getDeclaredField("isAvailable");
        statusField.setAccessible(true);

        statusField.set(animal, status == Status.AVAILABLE);
        statusField = cl2.getDeclaredField("isSold");
        statusField.setAccessible(true);
        statusField.set(animal, status == Status.SOLD);
        HashMap<String, String> photosMap = new HashMap<>();
        photoField = cl2.getDeclaredField("photosMap");
        photoField.setAccessible(true);

        for (Photo photo : photos) {
            photosMap.put(photo.getName(), photo.getURL());
        }
        photoField.set(animal, photosMap);

        return animal;
    }
}