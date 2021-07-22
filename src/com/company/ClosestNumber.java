package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<Integer> numbers) {
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<numbers.size()-1; i++)
            for (int j=i+1; j<numbers.size(); j++)
                if (Math.abs((numbers.get(i) - numbers.get(j)) )< diff)
                    diff = Math.abs((numbers.get(i) - numbers.get(j)));

        //sort array
        for(int i =0; i < numbers.size(); i++){
            if(numbers.get(i) - numbers.get(i+1) == diff){
                int temp = numbers.get(i+1);
               numbers.set(i, temp);
                numbers.set(i+1, numbers.get(i));
            }
        }
        for(int i = 0; i< numbers.size(); i++){
            if( (i+ 1) % 2 == 0){
                System.out.println();
            }
            System.out.println(numbers.get(i));
        }


    }



}

public class ClosestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        Result.closestNumbers(numbers);

        bufferedReader.close();
    }
}