package com.sane.maniac.mg.lambdasandstreams;

import java.util.function.*;

public class FunctionalInterface {

  public static void main(String[] args) {
    printAll();
  }

  public static void printAll() {
    System.out.println(predicateFunction(4));
    System.out.println(functionMethod(52));
    consumerFunction("some dumb val...");
    System.out.println(supplierFunction());
    System.out.println(unaryOperatorFunction(5));
    System.out.println(binaryOperatorFunction(5, 6));
  }

  public static boolean predicateFunction(int val) {
    Predicate<Integer> isEven = num -> num % 2 == 0;
    return isEven.test(val);
  }

  public static String functionMethod(int val) {
    Function<Integer, String> intToStringFunction = num -> "Number " + num;
    return intToStringFunction.apply(val);
  }

  public static void consumerFunction(String val) {
    Consumer<String> stringToUppercase = str -> System.out.println(str.toUpperCase());
    stringToUppercase.accept(val);
  }

  public static double supplierFunction() {
    Supplier<Double> randomVal = () -> Math.random();
    return randomVal.get();
  }

  public static int unaryOperatorFunction(int val) {
    UnaryOperator<Integer> square = num -> num * num;
    return square.apply(val);
  }

  public static int binaryOperatorFunction(int val1, int val2) {
    BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
    return sum.apply(val1, val2);
  }
}
