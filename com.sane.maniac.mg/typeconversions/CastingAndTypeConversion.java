package com.sane.maniac.mg.typeconversions;

public abstract class CastingAndTypeConversion {
  public static void main(String[] args) {
    callEachMethod();
  }

  public static void wideningConversion() {
    System.out.println("Widening Conversion:");
    int i = 100;
    long l = i; // no explicit type casting required
    float f = l; // no explicit type casting required
    double d = f; // no explicit type casting required
    System.out.println("Int value\t" + i);
    System.out.println("Long value\t" + l);
    System.out.println("Float value\t" + f);
    System.out.println("Double value\t" + d);
    System.out.println("================================\n");
  }

  public static void narrowingConversion() {
    System.out.println("Narrowing Conversion:");
    double d = 100.04;
    long l = (long) d; // explicit type casting required
    int i = (int) l; // explicit type casting required
    System.out.println("Double value\t" + d);
    System.out.println("Long value\t" + l);
    System.out.println("Int value\t" + i);
    System.out.println("================================\n");
  }

  public static void numericPromotion() {
    System.out.println("Numeric Promotion:");
    int i = 10;
    short s = 5;
    float f = 15.5f;
    double d = 20.5;
    int result = i + s; // Compile time error
    float result2 = i + f; // No error
    double result3 = f + d; // No error
    System.out.println("Int value\t" + i);
    System.out.println("Short value\t" + s);
    System.out.println("Float value\t" + f);
    System.out.println("Double value\t" + d);
    System.out.println("Result value\t(int = int + short)\t" + result);
    System.out.println("Result2 value\t(float = int + float)\t" + result2);
    System.out.println("Result3 value\t(double = float + double)\t" + result3);
    System.out.println("================================\n");
  }

  public static void stringConversion() {
    System.out.println("String Conversion:");
    int i = 100;
    String s = String.valueOf(i);
    System.out.println("Int value\t" + i);
    System.out.println("String value\t" + s);
    System.out.println("================================\n");
  }

  public static void stringToNumberConversion() {
    System.out.println("String to Number Conversion:");
    String s = "100";
    int i = Integer.parseInt(s);
    double d = Double.parseDouble(s);
    System.out.println("String value\t" + s);
    System.out.println("Int value\t" + i);
    System.out.println("Double value\t" + d);
    System.out.println("================================\n");
  }

  public static void explicitTypeCasting() {
    System.out.println("Explicit Type Casting:");
    double d = 54.33;
    float f = (float) d;
    int i = (int) f;
    byte b = (byte) i;
    System.out.println("Double value\t" + d);
    System.out.println("Float value\t" + f);
    System.out.println("Int value\t" + i);
    System.out.println("Byte value\t" + b);
    System.out.println("================================\n");
  }

  public static void dataTypeParsing() {
    System.out.println("Data Type Parsing:");
    String s = "100";
    int i = Integer.parseInt(s);
    double d = Double.parseDouble(s);
    System.out.println("String value\t" + s);
    System.out.println("Int value\t" + i);
    System.out.println("Double value\t" + d);
    System.out.println("================================\n");
  }

  public static void callEachMethod() {
    wideningConversion();
    narrowingConversion();
    numericPromotion();
    stringConversion();
    stringToNumberConversion();
    explicitTypeCasting();
    dataTypeParsing();
  }
}
