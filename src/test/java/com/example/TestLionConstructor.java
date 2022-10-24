package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestLionConstructor {

    @Mock
    Feline feline;

    @Test(expected = IllegalArgumentException.class)
    public void constructorThrowsExceptionOnUnsupportedSex(){
        Lion lion = new Lion("TEST", feline);
    }

    @Test
    public void constructorMakesObjectWithMaleSex(){
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(lion.hasMane,true);
    }

    @Test
    public void constructorMakesObjectWithFemaleSex(){
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(lion.hasMane,false);
    }
}
