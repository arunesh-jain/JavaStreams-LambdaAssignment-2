package com.PrimeNumber;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClass {

    // creating a list of integer type
    List<Integer> numbersList = Arrays.asList(21,22,23,1,2,3,4,5,6,88,87,97);

    // created a prime list of numbers
    static List<Integer> primeNumbers = Arrays.asList(1, 2, 3, 5, 23, 97);


    @Test
    public void testPrimeNumber() {
        assertEquals(primeNumbers, Filter.filterPrimeNumbers(numbersList));
        System.out.println("Test1 successfully Passed");

    }
    // creating 2nd list of integer type
    List<Integer> numbersList2 = Arrays.asList(11,21,51,45,47,49,39,17);

    // created another prime list of numbers
    static List<Integer> primeNumbers2 = Arrays.asList(11, 17, 47);

    @Test
    public void testPrimeNumber2() {
        assertEquals(primeNumbers2, Filter.filterPrimeNumbers(numbersList2));
        System.out.println("Test2 Successfully Passed");
    }

}

