package com.company;

import java.util.*;


//There are different images given as array and their corresponding frame numbers in another array.
//Images are to be arranged in order according to their frame numbers.

public class SortArray {

    static int[] arr = new int[]{50, 40, 70, 60, 90};
    static int[] index = new int[]{3,  0,  4,  1,  2};
    static void reorder() {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length; i++){
            map.put(index[i], arr[i]);
        }
        TreeMap<Integer, Integer> sorted = new TreeMap<>(map);
        System.out.println(sorted);

        Collection<Integer> values = sorted.values();
        Collection<Integer> keys = sorted.keySet();
        index = keys.stream().mapToInt(i->i).toArray();
        arr = values.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        reorder();
    }
}
