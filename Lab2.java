package com.helloworld;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть розмір матриці n та m - ");
        int n = scan.nextInt();
        int m = scan.nextInt();

        float[][] array = new float[n][m];
        float[][] arrayT = new float[m][n];

        System.out.println("Введіть матрицю дійсних чисел: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scan.nextFloat();
            }
        }
        //транспонуємо матрицю
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayT[j][i] = array[i][j];
            }
        }
        System.out.println("Транспонована матриця: ");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("  " + arrayT[j][i] + "   ");
            }
            System.out.println();
        }

        float sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arrayT[j][i];
            }
            System.out.println("У " + i + " стовпцю середнє значення елементів = " + sum / m);
            sum = 0;
        }
    }
}
