package com.sane.maniac.mg.javaio;

import java.util.Scanner;

public class IOStreams {

  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    String name = getUserName();
    System.out.println("Hello " + name);
  }

  public static String getUserName() {
    String name = "";
    Scanner sc = new Scanner(System.in);

    try {
      name = sc.nextLine();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } finally {
      sc.close();
    }

    return name;
  }
}
