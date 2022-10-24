package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCatMethods {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnsString() {
        Cat cat = new Cat(feline);
        String EXPECTED = "Мяу";
        Assert.assertEquals(EXPECTED, cat.getSound());
    }

    @Test
    public void getFoodCallsEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}
