package com.company.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Bat","Cat");
        List<String> wordsArrayList = new ArrayList<String>();
        List<String> wordsLinkedList = new LinkedList<String>();
        List<String> wordsVector = new Vector<String>();

        System.out.println(words.size());
        System.out.println(words.get(1));
        System.out.println(words.indexOf("Dog"));
        wordsArrayList.addAll(words);
        wordsLinkedList.add("Dog");
        wordsArrayList.set(2,"Fish");
        System.out.println(wordsArrayList.get(2));

    }
}
