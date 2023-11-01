package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static String getInUpperCase(String str){
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static boolean isPositive(int i) {
        return i > 0;
    }
}