package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManyWords {



    public static  int howMany(String sentence){
        int total = 0;

        List<String> myList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for(int i =0;i < myList.size();i++){
            if(myList.get(i).matches("^[A-Za-z]+(?:-[A-Za-z]+)*[.,;:?!]?$")){
                System.out.println(myList.get(i));
                total += 1;
            };
        }
        return total;
    }

    public static void main(String[] args) {

        String s = "how many eggs are in a half-dozen, 13?";
        String s1 = "he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
        String s2 = "jds dsaf lkdf kdsa fkldsf , adsbf ldka ads? asd bfdal ds bf{l. akj ds 878 dwa WE DE 7475 dsfh ds RAMU 748 dj";
        int result = howMany(s2);
        System.out.println(result);
    }
}
