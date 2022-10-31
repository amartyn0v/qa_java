package com.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;


@RunWith(JUnitParamsRunner.class)
public class TestLionConstructor {
    Feline feline = Mockito.mock(Feline.class);

    @Test(expected = IllegalArgumentException.class)
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Lion lion = new Lion("TEST", feline);
    }

    @Test
    @Parameters({"Самец,true", "Самка,false"})
    public void constructorSetHasManeTrueForMaleFalseForFemale(String sex, boolean expected) {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expected, lion.hasMane);
    }
}
