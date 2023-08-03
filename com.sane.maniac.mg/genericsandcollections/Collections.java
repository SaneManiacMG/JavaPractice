package com.sane.maniac.mg.genericsandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        arrays();
        lists();
    }

    public static void arrays() {
        String[] names = {"John", "Jane", "Jack", "Jill"};

        System.out.println("Array:\t\t\t\t\t" + Arrays.toString(names));
        System.out.println("Array Length: (names.length)\t" + names.length);
        System.out.println("Array Element: (names[0])\t\t" + names[0]);

        String[] copyOfNames = Arrays.copyOf(names, names.length);
        System.out.println("Copy of Array:\t\t\t\t" + Arrays.toString(copyOfNames));
        System.out.println("Array Sorting: (Arrays.sort(names))" + Arrays.toString(names));
        System.out.println("Array Binary Search: (Arrays.binarySearch(names, \"Jack\"))\t" + Arrays.binarySearch(names, "Jack"));
        System.out.println();
    }

    public static void lists() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Jill");

        System.out.println("Adding Element: (names.add(\"John\"" + names.add("Joemama"));
        System.out.println("Accessing Elelment: (names.get(0))\t" + names.get(0));
        System.out.println("Updating Element: (names.set(0, \"Joemama\"))\t" + names.set(0, "Joemama"));
        System.out.println("Removing Element: (names.remove(0))\t" + names.remove(0));
        System.out.println("List Size: (names.size())\t" + names.size());
        System.out.println("List Contains: (names.contains(\"Jack\"))\t" + names.contains("Jack"));
        System.out.println("List Index: (names.indexOf(\"Jack\"))\t" + names.indexOf("Jack"));
        System.out.println();
    }
}
