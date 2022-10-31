package com.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;


@RunWith(JUnitParamsRunner.class)
public class TestLionMethods {

    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void getKittensCallsFelineGetKittens() {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFoodCallsFelineGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(Mockito.anyString());
    }

    @Test
    @Parameters({"Самец,true", "Самка,false"})
    public void doesHaveManeReturnsTrueForMaleFalseForFemale(String sex, boolean expected) {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeReturnsFalseForFemale() {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
}
