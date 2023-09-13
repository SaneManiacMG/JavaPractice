package com.sane.maniac.mg.multithreading;

public class SimpleMultithreading {
    private static int sum = 0;

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int numOfThreads = 2;

        Thread[] threads = new Thread[numOfThreads];
        int chunkSize = numbers.length / numOfThreads;

        for (int i = 0; i < numOfThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numOfThreads - 1) ? numbers.length : startIndex + chunkSize;
            threads[i] = new Thread(new CalculatorTask(numbers, startIndex, endIndex));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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
