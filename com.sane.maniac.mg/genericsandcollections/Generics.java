package com.sane.maniac.mg.genericsandcollections;

import java.util.Arrays;
import java.util.List;

public class Generics<T> {
    private T field;

    public Generics(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public static void main(String[] args) {
        setGenerics();
        genericMethods();
        callWildcardMethods();
    }

    public static void setGenerics() {
        Generics<String> generics = new Generics<>("Hello, World!");
        System.out.println("String val:\t\t" + generics.getField());

        Generics<Integer> generics1 = new Generics<>(5);
        System.out.println("Integer val:\t" + generics1.getField());

        Generics<Double> generics2 = new Generics<>(5.5);
        System.out.println("Double val:\t\t" + generics2.getField());

        Generics<Boolean> generics3 = new Generics<>(true);
        System.out.println("Boolean val:\t" + generics3.getField());

        Generics<Character> generics4 = new Generics<>('c');
        System.out.println("Character val:\t" + generics4.getField());
    }

    public static void genericMethods() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "!"};

        int lastElementInIntArray = getLastElement(intArray);
        System.out.println("Last element in intArray:\t\t" + lastElementInIntArray);

        String lastElementInStringArray = getLastElement(stringArray);
        System.out.println("Last element in stringArray:\t" + lastElementInStringArray);
    }

    public static <T> T getLastElement(T[] array) {
        if (array == null) {
            return null;
        }
        return array[array.length - 1];
    }

    public static void unboundedWildcard(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void upperBoundedWildcard(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void lowerBoundedWildcard(List<? super Integer> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void callWildcardMethods() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        unboundedWildcard(integerList);
        upperBoundedWildcard(integerList);
        lowerBoundedWildcard(integerList);
    }
}
