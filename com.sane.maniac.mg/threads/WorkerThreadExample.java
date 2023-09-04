package com.sane.maniac.mg.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerThreadExample {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    for (int i = 1; i <= 5; i++) {
      RunnableTask task = new RunnableTask("Runnable Task " + i);
      executorService.execute(task);
    }

    for (int i = 1; i <= 5; i++) {
      CallableTask task = new CallableTask("Callable Task " + i);

      Future<String> future = executorService.submit(task);

      try {
        String result = future.get();
        System.out.println(result);
        System.out.println("Result from Callable Task: " + result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    executorService.shutdown();
  }
}

public class RunnableTask extends Runnable {

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

  public String call() throws Exception {
    Thread.sleep(2000);
    return name + " is running on Thread: " + Thread.currentThread().getName();
  }
}