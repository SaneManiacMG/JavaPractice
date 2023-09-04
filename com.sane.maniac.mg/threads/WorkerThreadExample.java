package com.sane.maniac.mg.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerThreadExample {

  public static void main(String[] args) {
    // Create thread pool
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    // Create a list of futures
    List<Future<String>> futures = new ArrayList<>();

    // Create 5 Runnable tasks and execute them
    for (int i = 1; i <= 5; i++) {
      RunnableTask task = new RunnableTask("Runnable Task " + i);
      executorService.execute(task);
    }

    // Create 5 Callable tasks and submit them to the executor
    for (int i = 1; i <= 5; i++) {
      CallableTask task = new CallableTask("Callable Task " + i);
      Future<String> future = executorService.submit(task);
      futures.add(future);
    }

    // Wait for all futures to complete
    for (Future<String> future : futures) {
      try {
        String result = future.get();
        System.out.println("Result from Callable Task: " + result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    // Shutdown the executor
    executorService.shutdown();
  }
}

class RunnableTask implements Runnable {

  private String name;

  public RunnableTask(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println(
      name + " is running on Thread: " + Thread.currentThread().getName()
    );
  }
}

class CallableTask implements Callable<String> {

  private String name;

  public CallableTask(String name) {
    this.name = name;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(2000);
    return name + " is running on Thread: " + Thread.currentThread().getName();
  }
}
