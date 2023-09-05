package com.sane.maniac.mg.filemanagement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOFileExample {

  public static void main(String[] args) {
    try {
      Files.createDirectories(
        Paths.get("com.sane.maniac.mg/filemanagement/files")
      );
      Files.createFile(
        Paths.get("com.sane.maniac.mg/filemanagement/files/file.txt")
      );

      String content = "Hello, NIO!";
      Files.write(
        Paths.get("com.sane.maniac.mg/filemanagement/files/", "file.txt"),
        content.getBytes()
      );

      byte[] bytes = Files.readAllBytes(
        Paths.get("com.sane.maniac.mg/filemanagement/files/", "file.txt")
      );
      String readContent = new String(bytes);
      System.out.println("File Content: " + readContent);
      Files.delete(
        Paths.get("com.sane.maniac.mg/filemanagement/files/", "file.txt")
      );
      Files.delete(Paths.get("com.sane.maniac.mg/filemanagement/files/"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
