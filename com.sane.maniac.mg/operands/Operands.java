package com.sane.maniac.mg.operands;

public abstract class Operands {
    public static void arithmeticOperators() {
        System.out.println("Arithmetic Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("Addition (+):\t" + (a + b));
        System.out.println("Subtraction (-):\t" + (a - b));
        System.out.println("Multiplication (*):\t" + (a * b));
        System.out.println("Division (/):\t" + (a / b));
        System.out.println("Modulus (%):\t" + (a % 2));
        System.out.println("================================\n");
    }

    public static void relationalOperators() {
        System.out.println("Relational Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("Equal to (==):\t" + (a == b));
        System.out.println("Not equal to (!=):\t" + (a != b));
        System.out.println("Greater than (>):\t" + (a > b));
        System.out.println("Less than (<):\t" + (a < b));
        System.out.println("Greater than or equal to (>=):\t" + (a >= b));
        System.out.println("Less than or equal to (<=):\t" + (a <= b));
        System.out.println("================================\n");
    }

    public static void logicalOperators() {
        System.out.println("Logical Operators:");
        boolean a = true;
        boolean b = false;
        System.out.println("A = " + a + "B = " + b);
        System.out.println("Logical AND (&&):\t" + (a && b));
        System.out.println("Logical OR (||):\t" + (a || b));
        System.out.println("Logical NOT (!):\t" + (!a));
        System.out.println("================================\n");
    }

    public static void assignmentOperators() {
        System.out.println("Assignment Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("Simple Assignment (=):\t" + (a = b));
        System.out.println("Add and Assignment (+=):\t" + (a += b));
        System.out.println("Subtract and Assignment (-=):\t" + (a -= b));
        System.out.println("Multiply and Assignment (*=):\t" + (a *= b));
        System.out.println("Divide and Assignment (/=):\t" + (a /= b));
        System.out.println("Modulus and Assignment (%=):\t" + (a %= 2));
        System.out.println("================================\n");
    }

    public static void incrementAndDecrementOperators() {
        System.out.println("Increment and Decrement Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("Pre-increment (++a):\t" + (++a));
        System.out.println("Post-increment (a++):\t" + (a++));
        System.out.println("Pre-decrement (--b):\t" + (--b));
        System.out.println("Post-decrement (b--):\t" + (b--));
        System.out.println("================================\n");
    }

    public static void ternaryOperators() {
        System.out.println("Ternary Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("Ternary Operator (a > b ? a : b):\t" + (a > b ? a : b));
        System.out.println("================================\n");
    }

    // TODO: look into Bitwise and Bit Shift Operators
    public static void bitwiseAndBitShiftOperators() {
        System.out.println("Bitwise and Bit Shift Operators:");
        int a = 10;
        int b = 20;
        System.out.printf("A = %d, B = %d\n", a, b);
        System.out.println("A = " + Integer.toBinaryString(a) + ", B = " + Integer.toBinaryString(b));
        System.out.println("Bitwise AND (&):\t" + (a & b));
        System.out.println("Bitwise OR (|):\t" + (a | b));
        System.out.println("Bitwise XOR (^):\t" + (a ^ b));
        System.out.println("Bitwise Complement (~):\t" + (~a));
        System.out.println("Left Shift (<<):\t" + (a << 2));
        System.out.println("Right Shift (>>):\t" + (a >> 2));
        System.out.println("Unsigned Right Shift (>>>):\t" + (a >>> 2));
        System.out.println("================================\n");
    }
    // TODO: look into assignment operators in more detail
    // TODO: look into instanceof operator
    // TODO: look into decrement and increment operators in more detail
    // TODO: look into ternary operators in more detail
}
