package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestLionMethods {
    @Mock
    Feline feline;

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
    public void doesHaveManeReturnsTrueForMale(){
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(lion.doesHaveMane(),true);
    }

    @Test
    public void doesHaveManeReturnsFalseForFemale(){
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(lion.doesHaveMane(),false);
    }
}
