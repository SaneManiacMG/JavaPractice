package com.sane.maniac.mg.genericsandcollections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        arrays();
        arrayList();
        linkedList();
        setCollections();
        mapCollections();
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

    public static void arrayList() {
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

    public static void linkedList() {
        System.out.println("LinkedList:");
        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Strawberry");

        System.out.println("Adding Element: (fruits.add(\"Apple\"))\t" + fruits.add("Apple"));
        System.out.println("Accessing Elelment: (fruits.get(0))\t" + fruits.get(0));
        System.out.println("Updating Element: (fruits.set(0, \"Joemama\"))\t" + fruits.set(0, "Joemama"));
        System.out.println("Removing Element: (fruits.remove(0))\t" + fruits.remove(0));
        System.out.println("List Size: (fruits.size())\t" + fruits.size());
        System.out.println("List Contains: (fruits.contains(\"Jack\"))\t" + fruits.contains("Jack"));
        System.out.println("List Index: (fruits.indexOf(\"Jack\"))\t" + fruits.indexOf("Jack"));
        System.out.println();
    }

    public static void setCollections() {
        System.out.println("Set Collections:");

        System.out.println("HashSet:");
        Set<String> hashSet = new HashSet<>();
        System.out.println("Set<String> hashSet = new HashSet<>();");

        System.out.println("LinkedHashSet:");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("Set<String> linkedHashSet = new LinkedHashSet<>();");

        System.out.println("TreeSet:");
        Set<String> treeSet = new TreeSet<>();
        System.out.println("Set<String> treeSet = new TreeSet<>();\n");

        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        System.out.println("hashSet.add(\"Banana\");");

        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        System.out.println("linkedHashSet.add(\"Banana\");");

        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Mango");
        System.out.println("treeSet.add(\"Banana\");\n");

        System.out.println("HashSet:\t" + hashSet);
        System.out.println("LinkedHashSet:\t" + linkedHashSet);
        System.out.println("TreeSet:\t" + treeSet);
    }

    public static void mapCollections() {
        System.out.println("Map Collections:");

        System.out.println("HashMap:");
        Map<String, String> hashMap = new HashMap<>();
        System.out.println("Map<String, String> hashMap = new HashMap<>();");

        System.out.println("LinkedHashMap:");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Map<String, String> linkedHashMap = new LinkedHashMap<>();");

        System.out.println("TreeMap:");
        Map<String, String> treeMap = new TreeMap<>();
        System.out.println("Map<String, String> treeMap = new TreeMap<>();\n");

        hashMap.put("Banana", "Yellow");
        hashMap.put("Orange", "Orange");
        hashMap.put("Mango", "Green");
        System.out.println("hashMap.put(\"Banana\", \"Yellow\");");

        linkedHashMap.put("Banana", "Yellow");
        linkedHashMap.put("Orange", "Orange");
        linkedHashMap.put("Mango", "Green");
        System.out.println("linkedHashMap.put(\"Banana\", \"Yellow\");");

        treeMap.put("Banana", "Yellow");
        treeMap.put("Orange", "Orange");
        treeMap.put("Mango", "Green");
        System.out.println("treeMap.put(\"Banana\", \"Yellow\");\n");

        System.out.println("HashMap:\t" + hashMap);
        System.out.println("LinkedHashMap:\t" + linkedHashMap);
        System.out.println("TreeMap:\t" + treeMap);
    }
}
