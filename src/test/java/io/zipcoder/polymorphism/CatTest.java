package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest () {
        //Given
        Cat cat = new Cat();
        String expected = "Meow";

        //When
        String actual = cat.speak();

        //Than
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetName () {
        //Give
        String expected = "CatName";
        Cat cat = new Cat(expected);

        //When

        String actual = cat.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testSetName () {
        //Give
        String expected = "Tequila";
        Cat cat = new Cat();

        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGerType () {
        //Given

        Cat cat = new Cat();

        //whn

        boolean expected = cat instanceof  Pet;
        boolean actual = true;
        Assert.assertEquals(expected,actual);
    }

}
