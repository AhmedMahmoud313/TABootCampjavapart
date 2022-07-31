package com.bootcampexercies.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person person;

    public PersonTest() {
    }

    @Override
    public void setUp() {
        System.out.println("Running! SetUp");
        person = new Person();
    }

    @Override
    public void tearDown() {
        System.out.println("Running! tearDown");
        person = null;
        assertNull(person);
    }

    /**
     * Test of getWeight method, of class Person.
     */

    public void testGetWeight() {
        System.out.println("getWeight Test");
        Person instance = new Person(52, 5.6f);
        int expResult = 52;
        int result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWeight method, of class Person.
     */

    public void testSetWeight() {
        System.out.println("setWeight Test");
        int weight = 66;
        Person instance = new Person();
        instance.setWeight(weight);
        int expResult = 66;
        int result = instance.getWeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeight method, of class Person.
     */

    public void testGetHeight() {
        System.out.println("getHeight Test");
        Person instance = new Person(78, 5.2F);
        float expResult = 5.2F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setHeight method, of class Person.
     */

    public void testSetHeight() {
        System.out.println("setHeight Test");
        float height = 6.1F;
        Person instance = new Person();
        instance.setHeight(height);
        float expResult = 6.1F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateBMI method, of class Person.
     */

    public void testgetBodyMassIndex() {
        System.out.println("calculateBMI");
        Person instance = new Person(41, 5.9F);
        String expResult = "1.1778225";
        String result = instance.getBodyMassIndex();
        assertEquals(expResult, result);

    }

}
