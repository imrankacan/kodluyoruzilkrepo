package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısı (m): ");
        int m = scanner.nextInt();
        System.out.print("Matrisin sütun sayısı (n): ");
        int n = scanner.nextInt();

        int[][] matris = new int[m][n];
        int[][] transpoz = new int[n][m];

        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz hesaplama
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        printMatris(matris);

        System.out.println("Transpoze:");
        printMatris(transpoz);

        scanner.close();
    }

    static void printMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
