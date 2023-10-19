package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 10; 
        operateAndPrint(n);
    }

    static void operateAndPrint(int n) {
        if (n <= 0) {
            System.out.println("Son Değer: " + n);
        } else {
            System.out.println("Son Değer: " + n);
            operateAndPrint(n - 5);
            System.out.println("Son Değer: " + n);
        }
    }
}