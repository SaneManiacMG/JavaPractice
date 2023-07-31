package com.sane.maniac.mg.conditions;

public class Conditions {
    public static void main(String[] args) {
        callAllMethods();
    }

    public static void ifElse() {
        System.out.println("If-Else:");
        System.out.println("if ([condition]) {\n\t[statements]\n} else {\n\t[statements]\n}");
        System.out.println("int a = 10;\nint b = 20;\nif (a > b) {\n\tSystem.out.println(\"A is greater than B\");\n} else {\n\tSystem.out.println(\"B is greater than A\");\n}");
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
        System.out.println("================================\n");
    }

    public static void elseIfConditions() {
        System.out.println("Else-If Conditions:");
        System.out.println("if ([condition]) {\n\t[statements]\n} else if ([condition]) {\n\t[statements]\n} else {\n\t[statements]\n}");
        System.out.println("int a = 10;\nint b = 20;\nif (a > b) {\n\tSystem.out.println(\"A is greater than B\");\n} else if (a < b) {\n\tSystem.out.println(\"B is greater than A\");\n} else {\n\tSystem.out.println(\"A and B are equal\");\n}");
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("B is greater than A");
        } else {
            System.out.println("A and B are equal");
        }
        System.out.println("================================\n");
    }

    public static void switchCaseStatements() {
        System.out.println("Switch-Case Statements:");
        System.out.println("switch ([expression]) {\n\tcase [value]:\n\t\t[statements]\n\t\tbreak;\n\tcase [value]:\n\t\t[statements]\n\t\tbreak;\n\tdefault:\n\t\t[statements]\n}");
        System.out.println("int a = 10;\nswitch (a) {\n\tcase 10:\n\t\tSystem.out.println(\"A is 10\");\n\t\tbreak;\n\tcase 20:\n\t\tSystem.out.println(\"A is 20\");\n\t\tbreak;\n\tdefault:\n\t\tSystem.out.println(\"A is neither 10 nor 20\");\n}");
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("A is 10");
                break;
            case 20:
                System.out.println("A is 20");
                break;
            default:
                System.out.println("A is neither 10 nor 20");
        }
        System.out.println("================================\n");
    }

    public static void callAllMethods() {
        ifElse();
        elseIfConditions();
        switchCaseStatements();
    }
}
