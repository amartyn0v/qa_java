package com.example;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class TestFelineMethods {

    @Test
    @Parameters({"1,1","5,5","0,0","-1,-1"})
    public void getKittensReturnsWhatItGets(int arg, int expected){
        Feline feline = new Feline();
        Assert.assertEquals(expected, feline.getKittens(arg));
    }

    public void getKittensReturns1ByDefault(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFamilyReturnsString(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatCallsGetFood() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
}
