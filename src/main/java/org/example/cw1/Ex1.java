package org.example.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(subtractProductAndSum(scanner.nextInt()));
    }

    public static int subtractProductAndSum(int n) {
        int sum=0, mult=1, num=n;

        while(num!=0){
            sum += num % 10;
            mult *= num % 10;
            num /= 10;
        }
        return mult - sum;
    }
}
