package org.example;

import org.junit.Assert;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class MapToProductTest {

    @org.junit.Test
    public void MapToProductTestAvailable() throws NoSuchFieldException, IllegalAccessException {
        Pet cat = new Pet("Масик", Status.AVAILABLE, List.of(new Photo("Масик на балконе","https://ru.wallpaper.mob.org/image/koshki-zhivotnye-25745.html"),
                new Photo("Масик кушает", "https://ru.wallpaper.mob.org/image/alisa_v_strane_udes_alice_in_wonderland-kino-koshki-multfilmy-7456.html")));
        MapToProduct mapToProduct = new MapToProduct();
        Animal animal = mapToProduct.mapToProductDto(cat);
        Assert.assertEquals("Масик Available {Масик на балконе=https://ru.wallpaper.mob.org/image/koshki-zhivotnye-25745.html, " +
                        "Масик кушает=https://ru.wallpaper.mob.org/image/alisa_v_strane_udes_alice_in_wonderland-kino-koshki-multfilmy-7456.html}",
                animal.toString());
    }

    @org.junit.Test
    public void MapToProductTestSold() throws NoSuchFieldException, IllegalAccessException {
        Pet cat = new Pet("Масик", Status.SOLD, List.of(new Photo("Масик на балконе","https://ru.wallpaper.mob.org/image/koshki-zhivotnye-25745.html"),
                new Photo("Масик кушает", "https://ru.wallpaper.mob.org/image/alisa_v_strane_udes_alice_in_wonderland-kino-koshki-multfilmy-7456.html")));
        MapToProduct mapToProduct = new MapToProduct();
        Animal animal = mapToProduct.mapToProductDto(cat);
        Assert.assertEquals("Масик Sold {Масик на балконе=https://ru.wallpaper.mob.org/image/koshki-zhivotnye-25745.html, " +
                        "Масик кушает=https://ru.wallpaper.mob.org/image/alisa_v_strane_udes_alice_in_wonderland-kino-koshki-multfilmy-7456.html}",
                animal.toString());
    }

}