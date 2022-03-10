package com.rus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temp;
        int[] boxNumber;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какое-либо число : ");
        int number = scanner.nextInt();
        temp = number;
        while (number > 0) {
            n++;
            number /= 10;
        }
        boxNumber = new int[n];
        number = temp;
        for (int i = 0; i < n; i++) {
            boxNumber[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(boxNumber[i]);
        }
    }
}
