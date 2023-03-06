package org.example.cw2;

import java.util.Scanner;

// Найти количество положительных чисел, после которых есть отрицательное
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int a = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            if ((b < 0) && (a > 0))
                k++;
            a = b;
        }
        System.out.println(k);
    }
}
