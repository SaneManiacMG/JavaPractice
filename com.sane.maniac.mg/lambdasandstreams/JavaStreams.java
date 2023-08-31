package com.sane.maniac.mg.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

  public static void main(String[] args) {
    printAll();
  }

  public static void printAll() {
    filteringStreams();
    mappingStreams();
    processingStreams();
  }

  public static void filteringStreams() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> evenNumbers = numbers.stream()
            .filter(num -> num % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(evenNumbers);
  }

  public static void mappingStreams() {
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");
    List<Integer> nameLengths = names.stream()
            .map(String::length)
            .collect(Collectors.toList());
    System.out.println(nameLengths);
  }

  public static void processingStreams() {
    List<String> words = Arrays.asList("Hello", "World", ",", "how", "are", "you", "?");
    words.stream()
            .forEach(System.out::print);

    String concatWords = words.stream()
            .collect(Collectors.joining(" "));
    System.out.println(concatWords);
  }
}
