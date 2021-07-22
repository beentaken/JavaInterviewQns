package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


class Filter {

    public static Predicate<String> nameStartingWithPrefix(String prefix){

        return  c -> c.startsWith(prefix);
    }

}

class Mapper {




    public static  Function<String, CharactersCount> getDistinctCharactersCount() {

        Function<String, CharactersCount> getDistinctCharactersCount
                = s -> {
                    int distinctCharactersCount = (int) s.chars().distinct().count();
                    CharactersCount charactersCount = new CharactersCount(s,distinctCharactersCount);


                    return charactersCount;
                };
        return getDistinctCharactersCount;
    }
}

public class PrefixCharactersCount {

    public static void main(String[] args) {
        List<String> names  = Arrays.asList(
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
                "annabella",
                "annabelle",
                "annebelle"
        );
        names.stream().filter(Filter.nameStartingWithPrefix("aa")).map(Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}
