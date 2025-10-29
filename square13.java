package jobsheet8Loop.jobsheet8Perulangan2;

import java.util.Scanner;

public class square13 {
    public static void main(String[] args) {
        Scanner acc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = acc.nextInt();

        for (int a = 1; a <= N; a++) {
            for (int i = 1; i <= N; i++) {
            System.out.print("*");
            }
            System.out.println();
        }
        acc.close();
    }
}