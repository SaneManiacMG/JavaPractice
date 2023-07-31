package com.sane.maniac.mg.loops;

public abstract class Loops {
    public static void main(String[] args) {
        callEachLoop();
    }

    public static void forLoop() {
        System.out.println("For Loop:");
        System.out.println("for ([initialization]; [condition]; [increment/decrement]) {\n\t[statements]\n}");
        System.out.println("for (int i = 0; i < 10; i++) {\n\tSystem.out.println(\"i = \" + i);\n}");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("================================\n");
    }

    public static void whileLoop() {
        System.out.println("While Loop:");
        System.out.println("while ([condition]) {\n\t[statements]\n[increment/decrement]\n}");
        System.out.println("int i = 0;\nwhile (i < 10) {\n\tSystem.out.println(\"i = \" + i);\n\ti++;\n}");
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("================================\n");
    }

    public static void doWhileLoop() {
        System.out.println("Do-While Loop:");
        System.out.println("do {\n\t[statements]\n\t[increment/decrement]\n} while ([condition]);");
        System.out.println("int i = 0;\ndo {\n\tSystem.out.println(\"i = \" + i);\n\ti++;\n} while (i < 10);");
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 10);
    }

    public static void callEachLoop() {
        forLoop();
        whileLoop();
        doWhileLoop();
    }
}
