package com.sane.maniac.mg.datatypes;

public abstract class DataTypes {
 public static void byteDataType(byte b) {
    byte min = -128;
    byte max = 127;
    byte val = b;

    System.out.println("Byte Datatype:");
    System.out.println("Byte min: " + min);
    System.out.println("Byte max: " + max);
    System.out.println("Byte val: " + val);
    System.out.println("=====================================\n");
  }

  public static void shortDataType(short s) {
    short min = -32768;
    short max = 32767;
    short val = s;

    System.out.println("Short Datatype:");
    System.out.println("Short min: " + min);
    System.out.println("Short max: " + max);
    System.out.println("Short val: " + val);
    System.out.println("=====================================\n");
  }

  public static void intDataType(int i) {
    int min = -2147483648;
    int max = 2147483647;
    int val = i;

    System.out.println("Int Datatype:");
    System.out.println("Int min: " + min);
    System.out.println("Int max: " + max);
    System.out.println("Int val: " + val);
    System.out.println("=====================================\n");
  }

  public static void longDataType(long l) {
    long min = -9223372036854775808L;
    long max = 9223372036854775807L;
    long val = l;

    System.out.println("Long Datatype:");
    System.out.println("Long min: " + min);
    System.out.println("Long max: " + max);
    System.out.println("Long val: " + val);
    System.out.println("=====================================\n");
  }

  public static void floatDataType(float f) {
    float min = 3.4028235E38F;
    float max = 1.4E-45F;
    float val = f;

    System.out.println("Float Datatype:");
    System.out.println("Float min: " + min);
    System.out.println("Float max: " + max);
    System.out.println("Float val: " + val);
    System.out.println("=====================================\n");
  }

  public static void doubleDataType(double d) {
    double min = 1.7976931348623157E308;
    double max = 4.9E-324;
    double val = d;

    System.out.println("Double Datatype:");
    System.out.println("Double min: " + min);
    System.out.println("Double max: " + max);
    System.out.println("Double val: " + val);
    System.out.println("=====================================\n");
  }

  public static void integerVariants() {
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;

    System.out.println("These data types are variants of the Integer class.");

    byteDataType(b);
    shortDataType(s);
    intDataType(i);
    longDataType(l);
  }

  public static void floatVariants() {
    float f = 3.4028235E38F;
    double d = 1.7976931348623157E308;

    System.out.println("These data types are variants of the Float class.");

    floatDataType(f);
    doubleDataType(d);
  }

  public static void charDataType(char c) {
    char val = c;

    System.out.println("Char Datatype:");
    System.out.println("Char val: " + val);
    System.out.println("=====================================\n");
  }

  public static void booleanDataType(boolean bool) {
    boolean val = bool;

    System.out.println("Boolean Datatype:");
    System.out.println("Boolean val: " + val);
    System.out.println(!val);
    System.out.println("=====================================\n");
  }

  public static void primitiveDataTypes() {
    integerVariants();
    floatVariants();
    charDataType('c');
    booleanDataType(true);
  }

  public static void stringDataType() {
    String str = "Hello World!";
    System.out.println("String Datatype:");
    System.out.println("String val: " + str);
    commonStringOperations(str);
  }

  public static void commonStringOperations(String str) {
    System.out.println("\nString methods: \t(" + str + ")");
    System.out.println("String length: \t" + str.length());
    System.out.println("String to uppercase: \t" + str.toUpperCase());
    System.out.println("String to lowercase: \t" + str.toLowerCase());
    System.out.println(
      "String substring: \tstr.substring(0, 5)\t" + str.substring(0, 5)
    );
    System.out.println(
      "String replace: \tstr.replace(\"World\", \"Universe\")\t" +
      str.replace("World", "Universe")
    );
    System.out.println(
      "String contains: \tstr.contains(\"World\")\t" + str.contains("World")
    );
    System.out.println(
      "String equals: \tstr.equals(\"Hello World!\")\t" +
      str.equals("Hello World!")
    );
    System.out.println(
      "String equalsIgnoreCase: \tstr.equalsIgnoreCase(\"hello world!\")\t" +
      str.equalsIgnoreCase("hello world!")
    );
    System.out.println(
      "String startsWith: \tstr.startsWith(\"Hello\")\t" +
      str.startsWith("Hello")
    );
    System.out.println(
      "String endsWith: \tstr.endsWith(\"!\")\t" + str.endsWith("!")
    );
    System.out.println(
      "String indexOf: \tstr.indexOf(\"World\")\t" + str.indexOf("World")
    );
    System.out.println("String charAt: \tstr.charAt(0)\t" + str.charAt(0));
    System.out.println("String isEmpty: \tstr.isEmpty()\t" + str.isEmpty());
    String str2 = "   Hello World!   ";
    System.out.println("String trim: \tstr.trim()\t" + str2.trim());
    System.out.println(
      "String concat: \tstr.concat(\" Goodbye!\")\t" + str.concat(" Goodbye!")
    );
    System.out.println(
      "String compareTo: \tstr.compareTo(\"Hello World!\")\t" +
      str.compareTo("Hello World!")
    );
    System.out.println(
      "String compareToIgnoreCase: \t" + str.compareToIgnoreCase("hello world!")
    );
    System.out.println(
      "String valueOf: \tString.valueOf(1)\t" + String.valueOf(1)
    );
    System.out.println("=====================================\n");
  }

  public static void stringBuilderDataClass() {
    StringBuilder sb = new StringBuilder("Hello World!");
    System.out.println("StringBuilder Datatype:");
    System.out.println("StringBuilder val: " + sb);
    System.out.println("StringBuilder length:\tsb.length()\t " + sb.length());
    System.out.println(
      "StringBuilder capacity:\tsb.capacity()\t" + sb.capacity()
    );
    System.out.println(
      "StringBuilder append:\tsb.append(\" Goodbye!\")\t" +
      sb.append(" Goodbye!")
    );
    System.out.println(
      "StringBuilder insert:\tsb.insert(0, \"Hi! \")\t" + sb.insert(0, "Hi! ")
    );
    System.out.println(
      "StringBuilder replace:\tsb.replace(0, 3, \"Hey!\")\t" +
      sb.replace(0, 3, "Hey!")
    );
    System.out.println(
      "StringBuilder delete:\tsb.delete(0, 4)\t" + sb.delete(0, 4)
    );
    System.out.println("StringBuilder reverse:\tsb.reverse()\t" + sb.reverse());
    sb.reverse();
    sb.replace(0, 1, "");
    System.out.println(
      "StringBuilder substring:\tsb.substring(0, 5)\t" + sb.substring(0, 5)
    );
    System.out.println("StringBuilder charAt:\tsb.charAt(0)\t" + sb.charAt(0));
    System.out.println(
      "StringBuilder indexOf:\tsb.indexOf(\"World\")\t" + sb.indexOf("World")
    );
    System.out.println(
      "StringBuilder lastIndexOf:\tsb.lastIndexOf(\"o\")\t" +
      sb.lastIndexOf("o")
    );
    System.out.println(
      "StringBuilder toString:\tsb.toString()\t" + sb.toString()
    );
    System.out.println(
      "StringBuilder equals:\tsb.equals(\"Hello World!\")\t" +
      sb.equals("Hello World!")
    );
    System.out.println(
      "StringBuilder hashCode:\tsb.hashCode()\t" + sb.hashCode()
    );
    System.out.println(
      "StringBuilder getClass:\tsb.getClass()\t" + sb.getClass()
    );
    System.out.println("=====================================\n");
  }

  public static void stringBufferDataClass() {
    StringBuffer sb = new StringBuffer("Hello World!");
    System.out.println("StringBuffer Datatype:");
    System.out.println("StringBuffer val: " + sb);
    System.out.println("StringBuffer length:\tsb.length()\t " + sb.length());
    System.out.println(
      "StringBuffer capacity:\tsb.capacity()\t" + sb.capacity()
    );
    System.out.println(
      "StringBuffer append:\tsb.append(\" Goodbye!\")\t" +
      sb.append(" Goodbye!")
    );
    System.out.println(
      "StringBuffer insert:\tsb.insert(0, \"Hi! \")\t" + sb.insert(0, "Hi! ")
    );
    System.out.println(
      "StringBuffer replace:\tsb.replace(0, 3, \"Hey!\")\t" +
      sb.replace(0, 3, "Hey!")
    );
    System.out.println(
      "StringBuffer delete:\tsb.delete(0, 4)\t" + sb.delete(0, 4)
    );
    System.out.println("StringBuffer reverse:\tsb.reverse()\t" + sb.reverse());
    sb.reverse();
    sb.replace(0, 1, "");
    System.out.println(
      "StringBuffer substring:\tsb.substring(0, 5)\t" + sb.substring(0, 5)
    );
    System.out.println("StringBuffer charAt:\tsb.charAt(0)\t" + sb.charAt(0));
    System.out.println(
      "StringBuffer indexOf:\tsb.indexOf(\"World\")\t" + sb.indexOf("World")
    );
    System.out.println(
      "StringBuffer lastIndexOf:\tsb.lastIndexOf(\"o\")\t" + sb.lastIndexOf("o")
    );
    System.out.println(
      "StringBuffer toString:\tsb.toString()\t" + sb.toString()
    );
    System.out.println(
      "StringBuffer equals:\tsb.equals(\"Hello World!\")\t" +
      sb.equals("Hello World!")
    );
    System.out.println(
      "StringBuffer hashCode:\tsb.hashCode()\t" + sb.hashCode()
    );
    System.out.println(
      "StringBuffer getClass:\tsb.getClass()\t" + sb.getClass()
    );
    System.out.println("=====================================\n");
  }

  public static void stringBufferAndStringBuilder() {
    System.out.println(
      "StringBuffer and StringBuilder are mutable sequences of characters."
    );
    System.out.println(
      "StringBuffer is synchronized and StringBuilder is not."
    );
    System.out.println("StringBuffer is thread-safe and StringBuilder is not.");
    System.out.println("StringBuffer is slower than StringBuilder.");
    System.out.println(
      "StringBuffer is used when multiple threads are working on the same object."
    );
    System.out.println(
      "StringBuilder is used when a single thread is working on the same object."
    );
    System.out.println(
      "StringBuffer and StringBuilder share the same methods."
    );
    System.out.println("=====================================\n");
    stringBufferDataClass();
    stringBuilderDataClass();
  }

  public static void dataInference() {
    System.out.println("Data Inference:");
    var i = 10;
    var j = 20.5;
    var k = i + j;
    var str = "Hello World!";
    var strAndNumber = str + k;
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("k = " + k);
    System.out.println("str = " + str);
    System.out.println("strAndNumber = " + strAndNumber);
    System.out.println("=====================================\n");
  }

  public static void callEachMethod() {
    primitiveDataTypes();
    stringDataType();
    stringBufferAndStringBuilder();
    dataInference();
  }
}
