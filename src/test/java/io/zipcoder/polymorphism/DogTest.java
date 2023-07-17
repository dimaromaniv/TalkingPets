package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest () {
        //Given
        Dog dog = new Dog();
        String expected = "Brow";

        //When
        String actual = dog.speak();

        //Than
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetName () {
        //Give
        String expected = "DogName";
        Dog dog = new Dog(expected);

        //When

        String actual = dog.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testSetName () {
        //Give
        Dog dog = new Dog();
        String expected = "Topic";
        //When
        dog.setName(expected);
        String actual = dog.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }

    @Test
     public void testGerType () {
        //Given

        Dog dog  = new Dog ();

        //whn
        boolean expected = dog instanceof  Dog;

        dog.getType(expected);

        Assert.assertTrue(expected);
    }
}
