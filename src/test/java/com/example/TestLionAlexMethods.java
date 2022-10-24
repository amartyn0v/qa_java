package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import java.util.List;

public class TestLionAlexMethods {
    @Mock
    Feline feline;

    @Test
    public void constructorMakesObjectWithMaleSexByDefault() {
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(alex.hasMane, true);
    }

    @Test
    public void getFiendsReturnsStringsWithFriends() {
        LionAlex alex = new LionAlex(feline);
        final List<String> EXPECTED = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        Assert.assertEquals(EXPECTED, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsStringPlace() {
        LionAlex alex = new LionAlex(feline);
        final String EXPECTED = "Нью-Йоркский зоопарк";
        Assert.assertEquals(EXPECTED, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturns0ByDefault(){
        LionAlex alex = new LionAlex(feline);
        Assert.assertEquals(0, alex.getKittens());
    }
}
