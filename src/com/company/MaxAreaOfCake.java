package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MaxAreaOfCake {
    public static int maxArea(int hp, int vp, int[] horizontalCuts, int[] verticalCuts){

        int largestArea;
        //store all cuts
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();

        //insert horizontal pipes
        for(int i = 1; i <=hp + 1; i++){
            hSet.add(i);
        }
        //insert vertical pipes
        for(int i = 1; i <=vp + 1; i++){
            vSet.add(i);
        }
        //remove horizontal cuts from horizontal pipe
        for (int i = 0; i < horizontalCuts.length; i++) {

            hSet.remove(horizontalCuts[i]);
        }
        //remove vertical cuts from horizontal pipe
        for (int i = 0; i < verticalCuts.length; i++) {

            vSet.remove(verticalCuts[i]);
        }

        // Stores left out horizontal and
        // vertical separators
        int[] hList = new int[hSet.size()];
        int[] vList = new int[vSet.size()];

        int i = 0;
        Iterator it1 = hSet.iterator();
        while (it1.hasNext()) {
            hList[i++] = (int)it1.next();
        }
        i = 0;
        Iterator it2 = vSet.iterator();

        while (it2.hasNext()) {
            vList[i++] = (int)it2.next();
        }
        // Sort both list in
        // ascending order
        Arrays.sort(hList);
        Arrays.sort(vList);

        int maxH = 0, p1 = 0, maxV = 0, p2 = 0;

        // Find maximum difference of neighbors of list1
        for (int j = 0; j < hList.length; j++) {
            maxH = Math.max(maxH, hList[j] - p1);
            p1 = hList[j];
        }

        // Find max difference of neighbors of list2
        for (int j = 0; j < vList.length; j++) {
            maxV = Math.max(maxV, vList[j] - p2);
            p2 = vList[j];
        }

        // Print largest volume
        largestArea = maxV * maxH;









        return largestArea;
    }


    public static void main(String[] args) {
        int hp = 2;
        int vp = 2;

       int[] hc = {1};
       int[] vc = {2};

       int max = maxArea(hp,vp, hc,vc);
       System.out.println(max);
    }
}
