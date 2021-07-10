package com.company;

public class CountSubString {

    /*Given a binary string, count number of substrings that
    start and end with 1. For example, if the input string is
    “00100101”, then there are three substrings “1001”,
    “100101” and “101”.
     */
    int countSubStr(char str[],int n)
    {
        int res = 0;  // Initialize result

        // Pick a starting point
        for (int i = 0; i<n; i++)
        {
            if (str[i] == '1')
            {
                // Search for all possible ending point
                for (int j = i + 1; j< n; j++)
                {
                    if (str[j] == '1')
                        res++;
                }
            }
        }
        return res;
    }
    int countSubStr2(char str[], int n)
    {
        int m = 0; // Count of 1's in input string

        // Traverse input string and count of 1's in it
        for (int i = 0; i < n; i++)
        {
            if (str[i] == '1')
                m++;
        }

        // Return count of possible pairs among m 1's
        return m * (m - 1) / 2;
    }
    public static void main(String[] args)
    {
        CountSubString count = new CountSubString();
        String string = "10101010";
        char str[] = string.toCharArray();
        int n = str.length;
        System.out.println(count.countSubStr(str,n));
    }

}
