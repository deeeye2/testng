package com.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Unit test for HelloWorld class.
 */
public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Hello, TestNG!";
        String actual = helloWorld.getMessage();
        assertEquals(actual, expected, "The message should match the expected output.");
    }
}
