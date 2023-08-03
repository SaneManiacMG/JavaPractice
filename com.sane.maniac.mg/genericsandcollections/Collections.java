package com.sane.maniac.mg.genericsandcollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        arrays();
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
    }

}
