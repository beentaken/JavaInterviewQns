package com.company;
// Find Perfect substring: String s comprised of numbers from 0 to 9.
// Find a Perfect string if all elements within a string occur exactly k times.
// Calculate the number of perfect strings in s.
public class CountSubStrWithCharacterCount {
    public static boolean check(int[] arr, int k) {
        for(int val : arr) {
            if(val != 0 && val != k) return false;
        }
        return true;
    }
    public static int perfectSubstring(String s, int k) {
        int res = 0;
        for(int i=0; i<s.length(); i++) {
            int[] arr = new int[10];
            for(int j = i; j<s.length(); j++) {
                if(j > i + (10*k))
                    break;
                char ch = s.charAt(j);
                arr[ch-'0']++;
                if(check(arr, k)) res++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n = perfectSubstring("1102021222",2);
        System.out.println(n);
    }
}
