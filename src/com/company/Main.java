package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double perKm = 2.2, totalAmount = 10;

        System.out.println("Please input distance in KM type : ");
        int distance = scanner.nextInt();

        totalAmount += distance * perKm;

        totalAmount = totalAmount < 20 ? 20 : totalAmount;

        System.out.println("Total amount " + totalAmount);

    }
}
