package com.sane.maniac.mg.serializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilazingApp {

  public static void main(String[] args) {
    try {
      // Serialization
      ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("com.sane.maniac.mg/serializing/object.ser")
      );
      MyClass myObject = new MyClass(69);
      out.writeObject(myObject);
      out.close();

      // Deserialization
      ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("com.sane.maniac.mg/serializing/object.ser")
      );
      MyClass deserializedObject = (MyClass) in.readObject();
      in.close();

      System.out.println(
        "Deserialized Value: " + deserializedObject.getValue()
      );
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

public class MyClass implements Serializable {

  private int value;
  public static final long serialVersionUID = 1L;

  public MyClass(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
