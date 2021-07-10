package com.company;

public class diffBetween2Ele {

    static int[] arr = new int[]{2, 3, 10, 6, 4, 8, 1};

    static void countDiff() {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr.length; i++)
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        System.out.println( max_diff);
    }

    public static void main(String[] args)
    {
       countDiff();
    }
}
