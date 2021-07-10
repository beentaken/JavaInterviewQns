package com.company;
// Find Perfect substring: String s comprised of numbers from 0 to 9.
// Find a Perfect string if all elements within a string occur exactly k times.
// Calculate the number of perfect strings in s.
public class CountSubStrWithSameCharacterCount {
    static int MAX_CHAR = 11;

    // Returns true if all values
// in freq[] are either 0 or k.
    static boolean check(int freq[], int k)
    {
        for (int i = 0; i < MAX_CHAR; i++)
            if (freq[i] !=0 && freq[i] != k)
                return false;
        return true;
    }

    // Returns count of substrings where frequency
// of every present character is k
    static int substrings(String s, int k)
    {
        int res = 0; // Initialize result

        // Pick a starting point
        for (int i = 0; i< s.length(); i++)
        {

            // Initialize all frequencies as 0
            // for this starting point
            int freq[] = new int[MAX_CHAR];

            // One by one pick ending points
            for (int j = i; j<s.length(); j++)
            {

                // Increment frequency of current char
                int index = s.charAt(j) - '0';
                freq[index]++;

                // If frequency becomes more than
                // k, we can't have more substrings
                // starting with i
                if (freq[index] > k)
                    break;

                    // If frequency becomes k, then check
                    // other frequencies as well.
                else if (freq[index] == k &&
                        check(freq, k) == true)
                    res++;
            }
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "110202122";
        int k = 2;
        System.out.println(substrings(s, k));


    }
}
