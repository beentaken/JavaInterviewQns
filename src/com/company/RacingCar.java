package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class RacingCar {


    public static int minMoves(List<Integer> obstacles){
        int[][] arr = new int[obstacles.size()][obstacles.size()];
        int[] startingArr = new int[obstacles.size()];
        startingArr[0]= 0;
        startingArr[1]= 1;
        startingArr[2]= 0;
        System.out.println(Arrays.toString(startingArr));
        for(int i = 0; i  < arr.length; i++){
            int temp =  obstacles.get(i);
            for(int j=0; j< arr[i].length; j++){
                if(temp == 1){
                    arr[i][0] = 1;
                }
                if(temp == 2){
                    arr[i][1] = 1;
                }
                if(temp == 3){
                    arr[i][2] = 1;
                }
                System.out.print(arr[i][j] + "\t");


            }
            System.out.println("");
        }
        int count = 0;
        for(int i = 0; i  < arr.length; i++){

            for(int j=0; j< arr[i].length; j++) {

                if(arr[i][j] == startingArr[1]){

                    System.out.print(i + " " + j);
                    if(j !=startingArr[1]){
                        count++;
                    }else{
                        System.out.println("hit obstacle");
                    }
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        List<Integer> obstacles = new ArrayList<>();
        obstacles.add(1);
        obstacles.add(2);
        obstacles.add(3);
        minMoves(obstacles);
    }
}
