package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number (USD)");
        double usd = scanner.nextDouble();
        System.out.println("VND is " + usd*rate);
    }
}
