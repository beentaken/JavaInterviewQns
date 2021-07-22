package com.company;

import java.util.function.Function;

public class CharactersCount  {
    private String name;
    private final Integer distinctCharacterCount;

    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;

    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }

    public void name(Object temp) {
       this.name = (String) temp;
    }


}
