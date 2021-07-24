package com.company;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class UniversityCareerFair {

    public static int maxEvent(List<Integer> arrival, List<Integer> duration){

        List<Pair<Integer,Integer>> input = new ArrayList<>();
        for(int i=0;i<arrival.size();i++){
            input.add(new Pair(arrival.get(i),duration.get(i)+arrival.get(i)));
        }
        Collections.sort(input, Comparator.comparingInt(Pair::getValue));
        int max = 0;
        int end = 0;
        for(int i=0;i<input.size();i++){
            if(end<=input.get(i).getKey()){
                max++;
                end = input.get(i).getValue();
            }
        }
        return max;


    }

    public static void main(String[] args) {
        int[] arrival = {1,3,3,5,7};
        int[] duration = {2,2,1,2,1};
        List<Integer> arrivalList = Arrays.stream(arrival).boxed().collect(Collectors.toList());
        List<Integer> durationList = Arrays.stream(duration).boxed().collect(Collectors.toList());

        System.out.println(maxEvent(arrivalList,durationList));
    }
}
