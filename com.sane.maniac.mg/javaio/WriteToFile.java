package com.sane.maniac.mg.javaio;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFile {

  public static void main(String[] args) {
    String name = writeData();
    writeToFile(name);
  }

  public static String writeData() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = s.nextLine();
    return name;
  }

  public static void writeToFile(String name) {
    try {
      FileWriter fw = new FileWriter("filename.txt");
      fw.write(name);
      fw.close();
      System.out.println("Successfully wrote to the file.");
    } catch (Exception e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
