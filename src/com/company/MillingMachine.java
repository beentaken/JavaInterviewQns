package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MillingMachine {

    public  static  int toolChanger(List<String> tools, int startIndex, String target){
        int leftToRightMove=  0;
        int rightToLeftMove=  0;
       boolean leftToRightFound = false;
        boolean rightToLeftFound = false;
        // find index of target from left to right
            for(int i = startIndex; i < tools.size(); i++){
                if(i > startIndex){
                    leftToRightMove++;
                }
                if(tools.get(i).equals(target)){
                    leftToRightFound = true;
                    break;
                }

            }
            if(!leftToRightFound) {
                for(int i = 0; i <= startIndex; i++){
                    leftToRightMove++;
                    if(tools.get(i).equals(target)){
                        break;
                    }
                }
            }

        // find index of target from right to left
        for(int i = startIndex; i >= 0; i--){
            if(i < startIndex){
                rightToLeftMove++;
            }
            if(tools.get(i).equals(target)){
                rightToLeftFound = true;
                break;
            }

        }
        if(!rightToLeftFound){
            for(int i = tools.size() -1 ; i >=  startIndex; i--){
                rightToLeftMove++;
                if(tools.get(i).equals(target)){
                    break;
                }
            }
        }



        System.out.println("rightToLeftMove: " + rightToLeftMove);
        System.out.println("leftToRightMove: " + leftToRightMove);
        if(leftToRightMove > rightToLeftMove){
            return rightToLeftMove;
        }
        if(rightToLeftMove >leftToRightMove ){
            return leftToRightMove;
        }
        else
            return leftToRightMove;

    }

    public static void main(String[] args) throws IOException {

        String[] tools =  { "ballendmill", "keywaycutter", "slotdrill", "facemill"};
        int toolsCount = tools.length;

        List<String> toolList = Arrays.asList(tools);
        int startIndex = 3;
        String target = "keywaycutter";

        int result = toolChanger(toolList, startIndex, target);
        System.out.println(result);

    }
}
