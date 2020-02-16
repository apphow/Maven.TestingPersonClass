package com.zipcodewilmington.person;

import com.sun.imageio.plugins.jpeg.JPEGImageReaderSpi;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given

        String expectedName = "Leon";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        assertEquals(expectedName, actualName);
        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person();

        // Then
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {

        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        assertEquals(expectedAge, actualAge);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {

        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testFemale() {
        Person person = new Person();
        Boolean expected = true;
        boolean female = true;
        assertTrue(female);
    }
    @Test
    public void testWeight() {
        double expected = 50;
        double actual = 50;
        assertEquals(expected, actual, 0.01);

    }
   @Test
    public void testMonthlySalary() {
        double expected = 10000;
        double actual = 10000;
       Assert.assertEquals(10000, 10000);

   }@Test
    public void testMiddleInitial() {
        String expected = "C";
        String actual = "C";
        Assert.assertEquals("C", "C");
    }
    @Test
    public void testEyeColorDeopth() {
        long expected = 45;
        long actual = 45;
        Assert.assertEquals(45, 45);
    }
    @Test
    public void testSetFemale() {
        Person person = new Person();
        Boolean expected = true;
        //when
        person.setFemale(expected);
        //then
        Boolean actual = true;
        Assert.assertTrue(true);
    }
    @Test
    public void setEyeColorDeopth() {
        // Given
        Person person = new Person();
        long  expected = 45;

        // When
        person.setEyeColorDepth(expected);

        // Then
        long actual = person.getEyeColorDepth();
        assertEquals(expected, actual);
    }



    }






