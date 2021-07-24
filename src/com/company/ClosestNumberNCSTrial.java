package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class ClosestNumberNCSTrial {

    public static void closestNumber(List<Integer> numbers){
        int size = numbers.size();
        Collections.sort(numbers);
        int minDiff = Integer.MAX_VALUE;
        for(int i= 0; i< size-1; ++i){
            minDiff = Math.min(minDiff, numbers.get(i+1) - numbers.get(i));
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< size-1; ++i ){
            if(numbers.get(i+1) - numbers.get(i) == minDiff){
                result.add(Arrays.asList(numbers.get(i), numbers.get(i+1)));
            }
        }

        for(List<Integer> r : result){
            for(int n :r){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] nums = {6,2,4,10};
        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
        closestNumber(numbers);

    }
}

//C++ solution

/*void closestNumbers(vector<int> numbers) {
    const int N = numbers.size();
    sort(numbers.begin(), numbers.end());\
    int min_diff = INT_MAX;
    for(int i = 0; i< N-1; ++i){
        min_diff = min(min_diff, numbers[i+1] -numbers[i]);
    }
    vector<vector<int>> res;
    for(int i = 0; i < N-1; ++i){
        if(numbers[i+1] - numbers[i] == min_diff){
            res.push_back({numbers[i],numbers[i+1]});
        }
    }
    for(vector<int> r: res){
        for(int n: r){
            cout << n << " ";
        }
        cout << "\n";
    }
}*/