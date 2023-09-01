package com.sane.maniac.mg.threads;

//import Thread class
import java.lang.Thread;

public class ThreadsApp {
    public static void main(String[] args) {

        //creating new threads
        Thread thread1 = new Thread(new Task("Task1"));
        Thread thread2 = new Thread(new Task("Task2"));

        thread1.start();
        thread2.start();
    }
}

public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " count " + i);

            try {
                //sleep for random amount of time
                Thread.sleep((long) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
