package com.sane.maniac.mg.multithreading;

public class SimpleMultithreading {
    private static int sum = 0;

    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Create an array of threads
        int numOfThreads = 2;
        Thread[] threads = new Thread[numOfThreads];

        // Divide the array of numbers into chunks
        int chunkSize = numbers.length / numOfThreads;

        // Create and start threads
        for (int i = 0; i < numOfThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numOfThreads - 1) ? numbers.length : startIndex + chunkSize;
            threads[i] = new Thread(new CalculatorTask(numbers, startIndex, endIndex));
            threads[i].start();
        }

        // Wait for threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the result
        System.out.println("Sum: " + sum);
    }

    private static class CalculatorTask implements Runnable {
        private final int[] numbers;
        private final int startIndex;
        private final int endIndex;

        public CalculatorTask(int[] numbers, int startIndex, int endIndex) {
            this.numbers = numbers;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int localSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += numbers[i];
            }

            synchronized (SimpleMultithreading.class) {
                sum += localSum;
            }
        }
    }
}
