package com.helloworld;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть початкові значння a та b - ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.println("Введіть кінцеві значення n та m - ");
        double n = scan.nextDouble();
        double m = scan.nextDouble();

        System.out.println(task(a, b, n, m));
    }
    private static String task(double a, double b, double n, double m) {
        int C = 1;
        double sum = 0;

        if ((a > n) || (b > m)) {
            return "Помилка: Порушенні границі";
        }
        //if (((b < 0) && (m >= 0)) || ((a < -C) && (n >= -C))) {
        //    return "Помилка: Ділення на нуль";
        //}

        for (double i = a; i <= n; i++) {
            for (double j = b; j <= m; j++) {
                sum += (i / j) / (i + C);
            }
        }
        return ("Сума = " + sum);
    }
}
