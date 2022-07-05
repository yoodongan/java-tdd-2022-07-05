package com.ll.exam;

public class Calculator {

    public static int run(String s) {
        boolean isMinus = s.indexOf("-") != -1;
        boolean isMultiple = s.indexOf("*") != -1;
        if (isMinus) {
            return runMinus(s);
        }
        if (isMultiple) {
            return runMutiple(s);
        }
        return runPlus(s);
    }

    private static int runMutiple(String s) {
        String[] sBits = s.split(" \\* ");
        int num1 = Integer.parseInt(sBits[0]);
        int num2 = Integer.parseInt(sBits[0]);
        return num1 * num2;
    }

    private static int runPlus(String s){
        String[] sBits = s.split(" \\+ ");
        int num1 = Integer.parseInt(sBits[0]);
        int num2 = Integer.parseInt(sBits[1]);
        return num1 + num2;
    }
    private static int runMinus(String s){
        String[] sBits = s.split(" \\- ");
        int num1 = Integer.parseInt(sBits[0]);
        int num2 = Integer.parseInt(sBits[1]);
        return num1 - num2;
    }

}
