package com.company;

//First find the difference between the adjacent elements of the array and store all
// differences in an auxiliary array diff[] of size n-1.
// Now this problems turns into finding the maximum sum subarray of this difference array.

import java.util.Arrays;

public class diffBetween2Ele2 {

    static int[] arr = new int[]{2, 3, 10, 6, 4, 8, 1};

    static void countDiff() {
        int diff[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length  - 1; i++)
            diff[i] = arr[i + 1] - arr[i];
        System.out.println(Arrays.toString(diff));
        // Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < arr.length  - 1; i++)
        {
            if (diff[i - 1] > 0)
                diff[i] += diff[i - 1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }

        System.out.println(max_diff );
    }

    public static void main(String[] args)
    {
        countDiff();
    }
}
