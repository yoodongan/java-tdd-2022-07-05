package com.ll.exam;

public class Calculator {

    public static int add(String s) {
        String[] sBits = s.split(" \\+ ");
        int num1 = Integer.parseInt(sBits[0]);
        int num2 = Integer.parseInt(sBits[1]);

        return num1 + num2;
    }
}
