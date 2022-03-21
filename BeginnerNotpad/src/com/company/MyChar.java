package com.company;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I' || Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U')
            return true;
        return false;
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)
            return true;
        return false;

    }

    public boolean isAlphabet() {
        if (ch >= 97 && ch <= 122)
            return true;
        return false;
    }

    public boolean isConsonant() {
        if (isAlphabet() && !isVowel())
            return true;
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for (char cz = 'a'; cz <= 'z'; cz++) {
            System.out.println(cz);
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char cz = 'A'; cz <= 'Z'; cz++) {
            System.out.println(cz);
        }

    }
}