package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class RacingCar {


    public static int minMoves(List<Integer> obstacles){
        int moves = 0;
        int currentLane = 2;
        int nextDiffObstacle = 0;

        for(int i =0; i < obstacles.size(); i++ ){
            if (obstacles.get(i) == currentLane){
                for (int nextObstacle: obstacles.subList(i, obstacles.size())) {

                        if(nextObstacle != currentLane){
                            nextDiffObstacle = nextObstacle;
                            break;
                        }
                }
                if(nextDiffObstacle == 0){
                    int[] arr = {1,2,3};
                    List<Integer> laneList = Arrays.stream(arr).boxed().collect(Collectors.toList());
                    List<Integer> currentList = new ArrayList<>();
                    currentList.add(currentLane);
                    laneList.removeAll(currentList);
                    currentLane = laneList.get(0);
                }else{
                    int[] arr = {1,2,3};
                    List<Integer> laneList = Arrays.stream(arr).boxed().collect(Collectors.toList());
                    List<Integer> currentList = new ArrayList<>();
                    currentList.add(currentLane);
                    currentList.add(nextDiffObstacle);
                    laneList.removeAll(currentList);
                    currentLane = laneList.get(0);
                }
                moves++;

            }
        }
        return moves;
    }


    public static void main(String[] args) {
        List<Integer> obstacles = new ArrayList<>();
        obstacles.add(2);
        obstacles.add(1);
        obstacles.add(3);
        obstacles.add(2);
        int moves = minMoves(obstacles);
        System.out.println(moves);
    }
}
