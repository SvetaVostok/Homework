package org.example;

import java.util.List;

public class Main {
    public static void mainProgram(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MapToProduct mapToProduct = new MapToProduct();
        Pet cat = new Pet("Масик", Status.AVAILABLE,
                List.of(new Photo("Масик на балконе","https://ru.wallpaper.mob.org/image/koshki-zhivotnye-25745.html"),
                        new Photo("Масик кушает", "https://ru.wallpaper.mob.org/image/alisa_v_strane_udes_alice_in_wonderland-kino-koshki-multfilmy-7456.html")));
        Animal animalCat = mapToProduct.mapToProductDto(cat);
        System.out.println(animalCat.toString());
    }
}
