package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class countDistinctWithGivenSum {
    static int[] arr = new int[]{5, 6, 5, 7, 7, 8};
    static void countDistinctPair(int sum) {
        int countPairs  = 0;
        // Stores index of
        // the left pointer


        // Stores index of
        // the right pointer

        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int k : arr) {

            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            mp.putIfAbsent(k, true);
        }
        Collection<Integer> keys = mp.keySet();
        arr = keys.stream().mapToInt(i->i).toArray();
        int z = 0;
        int j = arr.length - 1;
        while (z < j) {
            if (arr[z] + arr[j] == sum) {
                // Update cntPairs
                countPairs += 1;

                // Update i
                z++;

                // Update j
                j--;
            }
            else if (arr[z] + arr[j] < sum) {

                // Update i
                z++;
            }
            else {

                // Update j
                j--;
            }
        }

        System.out.println(countPairs);
    }

    public static void main(String[] args)
    {
        countDistinctPair(13);
    }
}
