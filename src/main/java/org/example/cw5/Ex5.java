package org.example.cw5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = i;
        }
        int[] res = new int[n];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += array[i];
            res[i] = sum;
        }

        for (int i = 1; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
