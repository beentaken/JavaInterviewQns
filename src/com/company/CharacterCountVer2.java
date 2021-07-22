package com.company;

import java.util.Arrays;
import java.util.List;

import java.util.function.Function;import java.util.function.Predicate;
/*
 * Create the Filter and Mapper classes here.
 */

class Filter2  {

    public static Predicate<String> nameStartingWithPrefix(String prefix){
        final Function<String, Predicate<String>> startsWithF =
                new Function<String, Predicate<String>>() {
                    @Override
                    public Predicate<String> apply(String s) {
                        return new Predicate<String>() {
                            @Override
                            public boolean test(String name) {
                                return name.startsWith(s);
                            }
                        };
                    }
                };
        return startsWithF.apply(prefix);
    }
}

class Mapper2 {




    public static  Function<String, CharactersCount2> getDistinctCharactersCount() {

        Function<String, CharactersCount2> getDistinctCharactersCount
                = s -> {
            int distinctCharactersCount = (int) s.chars().distinct().count();
            CharactersCount2 charactersCount = new CharactersCount2(s,distinctCharactersCount);


            return charactersCount;
        };
        return getDistinctCharactersCount;
    }
}

class CharactersCount2 {
    private final String name;
    private final Integer distinctCharacterCount;

    public CharactersCount2(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }
}

public class CharacterCountVer2 {


    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream()
                .filter(Filter2.nameStartingWithPrefix("aa"))
                .map(Mapper2.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}