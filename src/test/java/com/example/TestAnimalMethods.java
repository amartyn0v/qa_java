package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestAnimalMethods {

    @Test
    public void getFoodHerbivoresReturnsStringsForHerbivores() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void getFoodPredatoryReturnsStringsForPredatory() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionOnUnsupportedType() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Test");
    }

    @Test
    public void getFamilyReturnsStringsAllFamilies() {
        Animal animal = new Animal();
        final String EXPECTED = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(EXPECTED, animal.getFamily());
    }
}
