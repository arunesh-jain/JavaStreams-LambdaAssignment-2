package com.PrimeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {

    // using stream to filtering random prime number
    public static List<Integer> filterPrimeNumbers(List<Integer> numbersList){
        return numbersList.stream()
                .filter(number-> IntStream.rangeClosed(2, number/2).noneMatch(i -> number % i == 0))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] arguments) {

        List<Integer> numbersList = new ArrayList<>();              // used to creating a list of integer

        Random random = new Random();

        //Lambda Expression : Generates 100 random integers and adding to numbersList
        random.ints(100,1,100).forEach(i -> numbersList.add(i));
        System.out.println(numbersList);
        // getting Result as Prime Number
        List<Integer> primeNumber = Filter.filterPrimeNumbers(numbersList);
        System.out.println("Prime numbers are present in random list: "+primeNumber);
    }

}
