package com.sane.maniac.mg.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

  public static void main(String[] args) {
    readFile();
  }

  public static void readFile() {
    try {
      BufferedReader br = new BufferedReader(new FileReader("dummy-data.txt"));
      String line;

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
