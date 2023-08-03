package com.sane.maniac.mg.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

    public static void main(String[] args) throws IOException {
        ExceptionHandling eh = new ExceptionHandling();
        int decision = 0;
        decision = eh.pickFruit();
        eh.tryWithMultipleExceptionWithSameType(decision);
        eh.tryWithMultipleCatchAndFinally(decision);
        eh.tryWithResources();
        try {
            eh.throwsException();
            System.out.println("Only printed if nothing goes wrong");
        } catch (IOException e) {
            System.out.println("IOException caught in main method " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught in main method " + e.getMessage());
        }

    }

    public void tryWithMultipleCatchAndFinally(int index) {
        try {
            System.out.println("You picked " + fruits[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Exception: %s\n", e.getMessage());
        } catch (Exception e) {
            System.out.println("Something else went wrong, this is for generic exception");
            System.out.printf("Exception: %s\n", e.getMessage());
        } finally {
            System.out.println("It doesn't matter what you pick, this will always run");
        }
    }

    public void tryWithResources() {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Mapap\\OneDrive\\Desktop\\test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }

    public void tryWithMultipleExceptionWithSameType(int index) {
        try {
            System.out.println("You picked " + fruits[pickFruit() - 1]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public int pickFruit() {
        System.out.println("Picking a fruit...");
        int i = 0;

        for (String fruit : fruits) {
            System.out.printf("%d. %s\n", ++i, fruit);
        }

        System.out.print("Enter the number of the fruit you want to pick: ");
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return pickFruit();
        }
    }

    public void throwsException() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Mapap\\OneDrive\\Desktop\\test.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
