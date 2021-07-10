package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Snail {
    /**
     * Iterate through each line of input.
     */
    static void climbWall(int n, int m, int h){
        int numberOfDays = 1;
        int currentHeight = n;
        int heightPerDay = n - m;
        if(n ==m && h > n){
            System.out.println("Fail");
        }else
        if(n == 0 && h > 0 ){
            System.out.println("Fail");
        }
        else{
            while(currentHeight < h ){

                currentHeight += heightPerDay;
                numberOfDays++;
            }
            System.out.println(numberOfDays);
        }


    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<Integer> myList = new ArrayList<Integer>();

            String[] numberList =  in.readLine().trim().split("\\s+");

            for(String num : numberList){
                myList.add(Integer.parseInt(num));
                //System.out.println(num);
            }

            //System.out.println(line);

        climbWall(myList.get(0), myList.get(1), myList.get(2));
    }
}
