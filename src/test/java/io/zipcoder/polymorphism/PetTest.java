package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {


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
        Pet dog = new Dog(expected);

        //When

        String actual = dog.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testSetName () {
        //Give
        Pet cat = new Cat();
        String expected = "Topic";
        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Than
        Assert.assertEquals(expected,actual);
    }




}
